package org.jzy3d.plot3d.rendering.view;

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
  }

  public void reshape(int x, int y, int width, int height) {
    view.clear();
    view.render();

  }
}
