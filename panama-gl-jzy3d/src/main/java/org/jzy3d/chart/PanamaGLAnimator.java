package org.jzy3d.chart;

import org.jzy3d.plot3d.rendering.canvas.PanamaGLCanvas;

public class PanamaGLAnimator implements IAnimator {
  private static final int RENDERING_LOOP_PAUSE = 100;
  protected PanamaGLCanvas canvas;
  protected Thread t;
  protected boolean loop = false;
  protected static int id = 0;


  public PanamaGLAnimator(PanamaGLCanvas canvas) {
    this.canvas = canvas;
  }

  @Override
  public void start() {
    stop();

    t = new Thread(new Runnable() {

      @Override
      public void run() {
        loop = true;

        while (loop) {
          synchronized (canvas) {
            if (canvas != null)
              canvas.forceRepaint();
          }
          try {
            Thread.sleep(RENDERING_LOOP_PAUSE);
          } catch (InterruptedException e) {
          }
        }
      }

    }, "org.jzy3d.chart.PanamaGLAnimator thread " + (id++));
    t.start();
  }

  @Override
  public void stop() {
    if (t != null) {
      loop = false;
      // t.stop();
      t.interrupt();
      t = null;
    }
  }
}
