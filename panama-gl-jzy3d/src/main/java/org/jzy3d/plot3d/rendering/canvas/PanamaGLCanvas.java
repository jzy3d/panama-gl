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

public class PanamaGLCanvas implements IScreenCanvas{
  static Logger logger = Logger.getLogger(PanamaGLCanvas.class);
  
  protected View view;
  protected IAnimator animator;

  protected PanamaGLPainter painter;
  protected PanamaGLRenderer renderer;

  protected Coord2d pixelRatio = new Coord2d(1,1);


  public PanamaGLCanvas(IChartFactory factory, Scene scene, Quality quality) {
    view = scene.newView(this, quality);
    renderer = new PanamaGLRenderer(view);
    painter = (PanamaGLPainter)view.getPainter();
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
    return (int)(painter.glutGetWindowWidth() * pixelRatio.x);
  }

  @Override
  public int getRendererHeight() {
    return (int)(painter.glutGetWindowHeight() * pixelRatio.y);
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
    logger.warn("implemented in PanamaGLFrame");
  }

  @Override
  public void addKeyController(Object o) {
    logger.warn("not implemented");
  }

  @Override
  public void removeMouseController(Object o) {
    logger.warn("not implemented");
  }

  @Override
  public void removeKeyController(Object o) {
    logger.warn("not implemented");
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
  public Coord2d getPixelScaleJVM() {
    logger.warn("not implemented");
    return getPixelScale();
  }

  @Override
  public double getLastRenderingTimeMs() {
    // TODO Auto-generated method stub
    return -1;
  }

  @Override
  public void addCanvasListener(ICanvasListener listener) {
    logger.warn("not implemented");
  }

  @Override
  public void removeCanvasListener(ICanvasListener listener) {
    logger.warn("not implemented");
  }

  @Override
  public List<ICanvasListener> getCanvasListeners() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void display() {
    logger.warn("not implemented");
  }

  @Override
  public IAnimator getAnimation() {
    return animator;
  }

  @Override
  public boolean isNative() {
    return true;
  }
}
