package org.jzy3d.chart.factories;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.IAnimator;
import org.jzy3d.chart.PanamaGLAnimator;
import org.jzy3d.chart.PanamaGLFrame;
import org.jzy3d.chart.controllers.keyboard.camera.ICameraKeyController;
import org.jzy3d.chart.controllers.keyboard.screenshot.IScreenshotKeyController;
import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.chart.controllers.mouse.camera.ICameraMouseController;
import org.jzy3d.chart.controllers.mouse.picking.IMousePickingController;
import org.jzy3d.maths.Dimension;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.pipelines.NotImplementedException;
import org.jzy3d.plot3d.primitives.symbols.SymbolHandler;
import org.jzy3d.plot3d.rendering.canvas.ICanvas;
import org.jzy3d.plot3d.rendering.canvas.PanamaGLCanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.image.IImageWrapper;
import org.jzy3d.plot3d.rendering.scene.Scene;
import org.jzy3d.plot3d.rendering.view.IViewOverlay;
import org.jzy3d.plot3d.rendering.view.layout.IViewportLayout;
import org.jzy3d.plot3d.rendering.view.layout.PanamaGLViewAndColorbarsLayout;
import com.jogamp.opengl.GLException;

public abstract class AbstractPanamaGLPainterFactory implements IPainterFactory {
    protected IChartFactory chartFactory;
    protected boolean offscreen = false;
    protected int width;
    protected int height;
    


    @Override
    public IViewOverlay newViewOverlay() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IViewportLayout newViewportLayout() {
        return new PanamaGLViewAndColorbarsLayout();
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
        return new PanamaGLAnimator((PanamaGLCanvas) canvas);
    }

    @Override
    public ICameraMouseController newMouseCameraController(Chart chart) {
        return new AWTCameraMouseController(chart);
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
        return new PanamaGLFrame(chart);
    }

    @Override
    public IFrame newFrame(Chart chart, Rectangle bounds, String title) {
        return new PanamaGLFrame(chart, bounds, title);
    }

    @Override
    public IChartFactory getChartFactory() {
        return chartFactory;
    }

    @Override
    public void setChartFactory(IChartFactory chartFactory) {
        this.chartFactory = chartFactory;
    }

    @Override
    public boolean isOffscreen() {
        return offscreen;
    }

    @Override
    public void setOffscreenDisabled() {
        this.offscreen = false;
    }

    @Override
    public void setOffscreen(int width, int height) {
        this.offscreen = true;
        this.width = width;
        this.height = height;
    }

    @Override
    public void setOffscreen(Rectangle rectangle) {
        setOffscreen(rectangle.width, rectangle.height);
    }

    @Override
    public Dimension getOffscreenDimension() {
        return new Dimension(width, height);
    }
    

    @Override
    public boolean isDebugGL() {
      return false;
    }

    /** If true, will let GL trigger {@link GLException} if an error occur in OpenGL which ease debugging. Default is false. */
    @Override
    public void setDebugGL(boolean debugGL) {
      throw new NotImplementedException();
    }

}
