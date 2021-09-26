package org.jzy3d.factories;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.*;
import static jdk.incubator.foreign.CLinker.*;
import static opengl.glut_h.*;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.IFrame;
import org.jzy3d.maths.Rectangle;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.glutDisplayFunc$func;
import opengl.glutIdleFunc$func;

public class PanamaGLFrame implements IFrame{

  public PanamaGLFrame(Chart chart) {
  }

  public PanamaGLFrame(Chart chart, Rectangle bounds, String title) {
  }

  @Override
  public void initialize(Chart chart, Rectangle bounds, String title) {
  }

  @Override
  public void initialize(Chart chart, Rectangle bounds, String title, String message) {
    
    
    try (var scope = ResourceScope.newConfinedScope()) {
      var allocator = SegmentAllocator.ofScope(scope);
      var argc = allocator.allocate(C_INT, 0);
      glutInit(argc, argc);
      glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
      glutInitWindowSize(500, 500);
      glutCreateWindow(CLinker.toCString(title + message, scope));
      
      var teapot = new Teapot(allocator);
      var displayStub = glutDisplayFunc$func.allocate(teapot::display, scope);
      var idleStub = glutIdleFunc$func.allocate(teapot::onIdle, scope);
      glutDisplayFunc(displayStub);
      glutIdleFunc(idleStub);
      glutMainLoop();
  }

  }
}
