package org.jzy3d.plot3d.rendering.view;

import static opengl.macos.v10_15_3.glut_h.glutSwapBuffers;
import static opengl.macos.v10_15_3.glut_h.glutPostRedisplay;

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

    glutSwapBuffers();

  }

  public void reshape(int width, int height) {
    display();
  }

  public void onIdle() {
    glutPostRedisplay();
  }

}
