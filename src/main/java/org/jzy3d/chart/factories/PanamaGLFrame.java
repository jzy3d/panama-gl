package org.jzy3d.chart.factories;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import static jdk.incubator.foreign.CLinker.*;
import static opengl.glut_h.*;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.IFrame;
import org.jzy3d.maths.Rectangle;
import opengl.glutDisplayFunc$func;
import opengl.glutIdleFunc$func;

import org.jzy3d.plot3d.rendering.canvas.PanamaGLCanvas;

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
    
    
    try (var scope = ResourceScope.newConfinedScope()) {
      var allocator = SegmentAllocator.ofScope(scope);
      var argc = allocator.allocate(C_INT, 0);
      glutInit(argc, argc);
      glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
      glutInitWindowSize(bounds.width, bounds.height);
      glutCreateWindow(CLinker.toCString(title + "/" + message, scope));
      
      
      PanamaGLCanvas canvas = (PanamaGLCanvas)chart.getCanvas();
      
      var renderer = canvas.getRenderer();
      
      var displayStub = glutDisplayFunc$func.allocate(renderer::display, scope);
      //var idleStub = glutIdleFunc$func.allocate(renderer::onIdle, scope);
      
      glutDisplayFunc(displayStub);
      //glutIdleFunc(idleStub);
      glutMainLoop();
  }

  }
}
