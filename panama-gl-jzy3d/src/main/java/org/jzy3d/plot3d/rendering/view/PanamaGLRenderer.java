package org.jzy3d.plot3d.rendering.view;

import org.jzy3d.painters.PanamaGLPainter;

public class PanamaGLRenderer {
  protected View view;
  
  protected boolean init = false;
  
  public PanamaGLRenderer(View view) {
    this.view = view;
  }

  public void display() {
    if(!init) {
      view.init();
      init = true;
    }
    view.clear();
    view.render();

    PanamaGLPainter painter = (PanamaGLPainter)view.getPainter();

    painter.glutSwapBuffers();
  }

  public void reshape(int width, int height) {
    display();
  }

  public void onIdle() {
    PanamaGLPainter painter = (PanamaGLPainter)view.getPainter();
    painter.glutPostRedisplay();
  }

}
