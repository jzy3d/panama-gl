package org.jzy3d.chart;

import static jdk.incubator.foreign.CLinker.C_INT;
//import static opengl.macos.v10_15_3.glut_h.*;
import static opengl.macos.v11_4.glut_h.*;

//import opengl.macos.v10_15_3.*;
import opengl.macos.v11_4.*;

import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.chart.factories.IFrame;
import org.jzy3d.painters.PanamaGLPainter;

import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.rendering.canvas.PanamaGLCanvas;

import jdk.incubator.foreign.CLinker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class PanamaGLFrame implements IFrame {
    Thread glutBackgroundThread;

    public PanamaGLFrame(Chart chart) {
        this(chart, new Rectangle(0, 0, 800, 600), "");
    }

    public PanamaGLFrame(Chart chart, Rectangle bounds, String title) {
        initialize(chart, bounds, title);
    }

    @Override
    public void initialize(Chart chart, Rectangle bounds, String title) {
        initialize(chart, bounds, title, "PanamaGL");
    }

    @Override
    public void initialize(Chart chart, Rectangle bounds, String title, String message) {
        glutStart(chart, bounds, title, message);

        /*// Attempted access outside owning thread
        glutBackgroundThread = new Thread(new Runnable(){
            @Override
            public void run() {
                glutStart(chart, bounds, title, message);
            }
        });
        glutBackgroundThread.start();*/
    }

    private void glutStart(Chart chart, Rectangle bounds, String title, String message) {
        var painter = (PanamaGLPainter) chart.getPainter();
        var canvas = (PanamaGLCanvas) chart.getCanvas();
        var renderer = canvas.getRenderer();
        var scope = painter.getScope();
        var allocator = painter.getAllocator();
        var argc = allocator.allocate(C_INT, 0);

        // GLUT Init window
        glutInit(argc, argc);
        glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
        glutInitWindowSize(bounds.width, bounds.height);
        glutCreateWindow(CLinker.toCString(title + "/" + message, scope));

        // GLUT Display/Idle callback
        glutDisplayFunc(glutDisplayFunc$func.allocate(renderer::display, scope));
        glutReshapeFunc(glutReshapeFunc$func.allocate(renderer::reshape, scope));
        glutIdleFunc(glutIdleFunc$func.allocate(renderer::onIdle, scope));

        // GLUT Mouse callbacks
        AWTCameraMouseController mouse = (AWTCameraMouseController) chart.getMouse();

        // GLUT Mouse click listener
        glutMouseFunc$func mouseClickCallback = new glutMouseFunc$func(){
            long time;
            long timePrev;
            @Override
            public void apply(int button, int state, int x, int y) {
                int clickCount = 1;
                time = System.currentTimeMillis();
                if(timePrev>0){
                    long elapsed = time-timePrev;
                    if(elapsed<200){
                        clickCount++;
                    }
                }
                if(state==0)
                   mouse.mousePressed(mouseEvent(x, y, InputEvent.BUTTON1_DOWN_MASK, clickCount));
                else if(state==1)
                    mouse.mouseReleased(mouseEvent(x, y, InputEvent.BUTTON1_DOWN_MASK, clickCount));

                timePrev = time;
                //System.out.println("mouse x:"+x+" y:"+y + " button:" + button + " state:" + state);
            }
        };
        glutMouseFunc(glutMouseFunc$func.allocate(mouseClickCallback, scope));

        // Motion is invoked if a mouse button is pressed, otherwise not
        // https://www.opengl.org/resources/libraries/glut/spec3/node51.html
        glutMotionFunc$func mouseMotionCallback = new glutMotionFunc$func(){
            @Override
            public void apply(int x, int y) {
                mouse.mouseDragged(mouseEvent(x, y, InputEvent.BUTTON1_DOWN_MASK));
                //System.out.println("mouse motion.x:"+x+" y:"+y);
            }
        };
        glutMotionFunc(glutMotionFunc$func.allocate(mouseMotionCallback, scope));


        // -----------------------------------------------------
        // Version - GLUT need to be initialized

        System.out.println(version(painter));

        // -----------------------------------------------------
        // Warn : this will block execution

        glutMainLoop();

        // glut is OS specific
    }

    protected static MouseEvent mouseEvent(int x, int y, int modifiers) {
        return mouseEvent(x,y,modifiers,1);
    }
    protected static MouseEvent mouseEvent(int x, int y, int modifiers, int clickCount) {
        return new MouseEvent(dummy, 0, 0, modifiers, x, y, 100, 100, clickCount, false, 0);
    }
    static Component dummy = new JPanel();

    protected StringBuffer version(PanamaGLPainter painter){
        StringBuffer sb = new StringBuffer();
        sb.append("GL_VENDOR     : " + painter.glGetString(glut_h.GL_VENDOR()) + "\n");
        sb.append("GL_RENDERER   : " + painter.glGetString(glut_h.GL_RENDERER()) + "\n");
        sb.append("GL_VERSION    : " + painter.glGetString(glut_h.GL_VERSION()) + "\n");

        String ext = painter.glGetString(glut_h.GL_EXTENSIONS());

        if(ext!=null) {
            sb.append("GL_EXTENSIONS : " + "\n");
            for(String e: ext.split(" ")) {
                sb.append("\t" + e + "\n");
            }
        }
        else {
            sb.append("GL_EXTENSIONS : null\n");
        }

        return sb;
    }


}
