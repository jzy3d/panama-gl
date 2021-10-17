package org.jzy3d.plot3d.rendering.canvas;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.jzy3d.chart.IAnimator;
import org.jzy3d.chart.factories.IChartFactory;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.painters.PanamaGLPainter;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.PanamaGLRenderer;
import org.jzy3d.plot3d.rendering.view.View;

import static opengl.glut_h.*;

public class PanamaGLCanvas implements IScreenCanvas{
  static Logger logger = Logger.getLogger(PanamaGLCanvas.class);
  
  protected View view;
  protected IAnimator animator;
  protected PanamaGLRenderer renderer;

  protected Coord2d pixelRatio = new Coord2d(1,1);


  public PanamaGLCanvas(IChartFactory factory, Scene scene, Quality quality) {
    view = scene.newView(this, quality);
    
    renderer = new PanamaGLRenderer(view);

    animator = factory.getPainterFactory().newAnimator(this);
  }

  public PanamaGLRenderer getRenderer() {
    return renderer;
  }

  @Override
  public View getView() {
    return view;
  }

  @Override
  public int getRendererWidth() {
    return (int)(glutGet(GLUT_WINDOW_WIDTH()) * pixelRatio.x);
  }

  @Override
  public int getRendererHeight() {
    return (int)(glutGet(GLUT_WINDOW_HEIGHT()) * pixelRatio.y);
  }

  @Override
  public void screenshot(File file) throws IOException {
    throw new IOException("not implemented");
  }

  @Override
  public Object screenshot() {
    throw new RuntimeException("not implemented");
  }

  @Override
  public void forceRepaint() {
    logger.info("not forcing repaint since renderer.display() crashes JVM");
    /*renderer.display();*/
  }

  @Override
  public void dispose() {
    logger.warn("not implemented");
  }

  @Override
  public void addMouseController(Object o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void addKeyController(Object o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void removeMouseController(Object o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void removeKeyController(Object o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public String getDebugInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setPixelScale(float[] scale) {
    pixelRatio.set(scale[0], scale[1]);
  }

  @Override
  public Coord2d getPixelScale() {
    return pixelRatio;
  }

  @Override
  public double getLastRenderingTimeMs() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void addCanvasListener(ICanvasListener listener) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void removeCanvasListener(ICanvasListener listener) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<ICanvasListener> getCanvasListeners() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public IAnimator getAnimation() {
    // TODO Auto-generated method stub
    return animator;
  }
}
