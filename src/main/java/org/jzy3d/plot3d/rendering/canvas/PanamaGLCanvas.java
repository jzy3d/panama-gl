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
  protected PanamaGLPainter painter;
  protected IAnimator animator;
  
  protected PanamaGLRenderer renderer;


  public PanamaGLCanvas(IChartFactory factory, Scene scene, Quality quality) {
    view = scene.newView(this, quality);
    
    renderer = new PanamaGLRenderer(view);
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
    logger.warn("Return constant 800");
    return 800;
  }

  @Override
  public int getRendererHeight() {
    logger.warn("Return constant 600");
    return 600;
  }

  @Override
  public void screenshot(File file) throws IOException {
    logger.warn("not implemented");
  }

  @Override
  public Object screenshot() {
    logger.warn("not implemented");
    return null;
  }

  @Override
  public void forceRepaint() {
    logger.warn("not implemented");
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
    // TODO Auto-generated method stub
    
  }

  @Override
  public Coord2d getPixelScale() {
    // TODO Auto-generated method stub
    return null;
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
    return null;
  }
}
