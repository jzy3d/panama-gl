package org.jzy3d.factories;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jzy3d.chart.IAnimator;
import org.jzy3d.chart.factories.IChartFactory;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.plot3d.rendering.canvas.ICanvasListener;
import org.jzy3d.plot3d.rendering.canvas.IScreenCanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.View;

public class PanamaGLCanvas implements IScreenCanvas{

  public PanamaGLCanvas() {
  }

  public PanamaGLCanvas(IChartFactory factory, Scene scene, Quality quality) {
    // TODO Auto-generated constructor stub
  }

  @Override
  public View getView() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getRendererWidth() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getRendererHeight() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void screenshot(File file) throws IOException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Object screenshot() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void forceRepaint() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub
    
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
