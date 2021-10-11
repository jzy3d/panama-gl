package org.jzy3d.chart.factories;

import static jdk.incubator.foreign.CLinker.C_INT;
import static opengl.glut_h.*;

import org.jzy3d.painters.PanamaGLPainter;
import org.jzy3d.chart.Chart;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.painters.PanamaGLPainter;
import org.jzy3d.plot3d.rendering.canvas.PanamaGLCanvas;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.glutDisplayFunc$func;

public class PanamaGLFrame implements IFrame{

  public PanamaGLFrame(Chart chart) {
    this(chart, new Rectangle(0,0,800,600), "");
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
    
    PanamaGLPainter painter = (PanamaGLPainter)chart.getPainter();
    PanamaGLCanvas canvas = (PanamaGLCanvas)chart.getCanvas();
    
    var renderer = canvas.getRenderer();

    
    //try (var scope = ResourceScope.newConfinedScope()) {
      var allocator = SegmentAllocator.ofScope(painter.getScope());
      var argc = allocator.allocate(C_INT, 0);
      glutInit(argc, argc);
      glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
      glutInitWindowSize(bounds.width, bounds.height);
      glutCreateWindow(CLinker.toCString(title + "/" + message, painter.getScope()));
      
      
      
      System.out.println(renderer);
      
      var displayStub = glutDisplayFunc$func.allocate(renderer::display, painter.getScope());
      
      glutDisplayFunc(displayStub);

      System.out.println("Glut main loop start");

      glutMainLoop();
  //}
     System.out.println("Glut main loop done");
  }
}
