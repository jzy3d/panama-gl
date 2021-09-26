package org.jzy3d.factories;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.IAnimator;
import org.jzy3d.chart.controllers.keyboard.camera.ICameraKeyController;
import org.jzy3d.chart.controllers.keyboard.screenshot.IScreenshotKeyController;
import org.jzy3d.chart.controllers.mouse.camera.ICameraMouseController;
import org.jzy3d.chart.controllers.mouse.picking.IMousePickingController;
import org.jzy3d.chart.factories.IChartFactory;
import org.jzy3d.chart.factories.IFrame;
import org.jzy3d.chart.factories.IPainterFactory;
import org.jzy3d.maths.Dimension;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.painters.IPainter;
import org.jzy3d.plot3d.primitives.symbols.SymbolHandler;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.image.IImageWrapper;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.IViewOverlay;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;

public class PanamaGLPainterFactory implements IPainterFactory{

  public PanamaGLPainterFactory() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public IPainter newPainter() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IViewOverlay newViewOverlay() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IViewportLayout newViewportLayout() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SymbolHandler newSymbolHandler(IImageWrapper image) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ICanvas newCanvas(IChartFactory factory, Scene scene, Quality quality) {
    return new PanamaGLCanvas(factory, scene, quality);
  }

  @Override
  public IAnimator newAnimator(ICanvas canvas) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ICameraMouseController newMouseCameraController(Chart chart) {
    return new PanamaGLMouse(chart);
  }

  @Override
  public IMousePickingController newMousePickingController(Chart chart, int clickWidth) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ICameraKeyController newKeyboardCameraController(Chart chart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IScreenshotKeyController newKeyboardScreenshotController(Chart chart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public IFrame newFrame(Chart chart) {
    // TODO Auto-generated method stub
    return new PanamaGLFrame(chart);
  }

  @Override
  public IFrame newFrame(Chart chart, Rectangle bounds, String title) {
    return new PanamaGLFrame(chart, bounds, title);
  }

  @Override
  public void setChartFactory(IChartFactory factory) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public IChartFactory getChartFactory() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isOffscreen() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void setOffscreenDisabled() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setOffscreen(int width, int height) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setOffscreen(Rectangle rectangle) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Dimension getOffscreenDimension() {
    // TODO Auto-generated method stub
    return null;
  }

}
