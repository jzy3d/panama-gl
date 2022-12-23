package org.jzy3d.demos.teapot;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.ChartFactory;
import org.jzy3d.chart.factories.PanamaGLChartFactory;
import org.jzy3d.chart.factories.PanamaGLPainterFactory_MacOS_10_15_3;
import org.jzy3d.colors.Color;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.lights.Light;

public class TeapotDemoPanamaGL {

  public static void main(String[] args) {
    //LoggerUtils.maximal();

    Teapot teapot = new Teapot();
    teapot.setFaceDisplayed(true);
    teapot.setColor(Color.WHITE);
    teapot.setWireframeColor(Color.CYAN);
    teapot.setWireframeDisplayed(false);
    teapot.setWireframeWidth(2);
    teapot.setReflectLight(true);

    // ---------------------------------------------
    /**
     * In case the below factory is not working, one can use CPU rendering fallback as follow
     * <code>
     * ChartFactory factory = new EmulGLChartFactory(); // use me as a reference
     * </code>
     *
     * @see https://github.com/jzy3d/jzy3d-api/blob/master/jzy3d-tutorials/src/main/java/org/jzy3d/demos/surface/SurfaceDemoEmulGL.java
     */
    ChartFactory factory = new PanamaGLChartFactory(new PanamaGLPainterFactory_MacOS_10_15_3());

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

    chart.add(teapot);

    Light light = chart.addLight(chart.getView().getBounds().getCorners().getXmaxYmaxZmax());

    // ---------------------------------------------

    // Manual HiDPI setting
    float[] pixelScale = {2f,2f};
    chart.getCanvas().setPixelScale(pixelScale);

    chart.open(800,600);
    // with GLUT, can't do anything after open until main loop ends
  }
}
