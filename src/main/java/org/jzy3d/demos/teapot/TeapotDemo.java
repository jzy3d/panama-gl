package org.jzy3d.demos.teapot;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.ChartFactory;
import org.jzy3d.chart.factories.PanamaGLChartFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.lights.Light;
import org.jzy3d.utils.LoggerUtils;

public class TeapotDemo {

  public static void main(String[] args) {
    LoggerUtils.maximal();
    
    Teapot teapot = new Teapot();
    teapot.setFaceDisplayed(true);
    teapot.setColor(Color.WHITE);
    teapot.setWireframeColor(Color.CYAN);
    teapot.setWireframeDisplayed(false);
    teapot.setWireframeWidth(2);
    teapot.setReflectLight(true);
    
    // ---------------------------------------------
    ChartFactory factory = new PanamaGLChartFactory();
    
    //ChartFactory factory = new EmulGLChartFactory();
    
    // Emulgl will show limitations
    // 1-wireframe and face do not mix cleanly (polygon offset fill)
    // 2-wireframe color tend to saturate (here in green)
    
    Quality q = Quality.Advanced(); 
    q.setDepthActivated(true);
    q.setAlphaActivated(false);
    q.setAnimated(true);
    q.setHiDPIEnabled(false);
    
    Chart chart = factory.newChart(q);

    chart.getView().setSquared(false);
    chart.getView().setBackgroundColor(Color.BLACK);
    chart.getView().getAxis().getLayout().setMainColor(Color.WHITE);
    chart.getView().setAxisDisplayed(true);
    // ---------------------------------------------

    chart.add(teapot);
    
    //Light light = chart.addLightOnCamera();
    Light light = chart.addLight(chart.getView().getBounds().getCorners().getXmaxYmaxZmax());
    //light.setRepresentationDisplayed(true);
    
    // ---------------------------------------------

    // Manual HiDPI setting
    float[] pixelScale = {2f,2f};
    chart.getCanvas().setPixelScale(pixelScale);

    chart.open(800,600); // with panama pseudo frame, should be opened first

    chart.addMouseCameraController();

  }
}
