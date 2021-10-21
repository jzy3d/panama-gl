package org.jzy3d.demos.surface;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.EmulGLSkin;
import org.jzy3d.chart.factories.ChartFactory;
import org.jzy3d.chart.factories.EmulGLChartFactory;
import org.jzy3d.chart.factories.PanamaGLChartFactory;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Func3D;
import org.jzy3d.plot3d.builder.SurfaceBuilder;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;

import java.io.File;
import java.io.IOException;


/**
 * Demo an surface chart made with Panama (JEP-412).
 * 
 * @author Martin Pernollet
 *
 */
public class SurfaceDemoPanamaGL {

  static final float ALPHA_FACTOR = 0.55f;// .61f;

  public static void main(String[] args) {
    //ChartFactory factory = new EmulGLChartFactory(); // use me as a reference
    ChartFactory factory = new PanamaGLChartFactory();

    Quality q = Quality.Advanced(); 
    Chart chart = factory.newChart(q);
    chart.add(surface());

    // Manual HiDPI setting
    float[] pixelScale = {2f,2f};
    chart.getCanvas().setPixelScale(pixelScale);

    chart.open(800,600);
    // with GLUT, can't do anything after open until main loop ends
  }


  private static Shape surface() {
    SurfaceBuilder builder = new SurfaceBuilder();
    
    Func3D func = new Func3D((x, y) -> x * Math.sin(x * y));
    Range range = new Range(-3, 3);
    int steps = 50;

    Shape surface = builder.orthonormal(new OrthonormalGrid(range, steps), func);

    ColorMapper colorMapper = new ColorMapper(new ColorMapRainbow(), surface, new Color(1, 1, 1, ALPHA_FACTOR));
    surface.setColorMapper(colorMapper);
    surface.setFaceDisplayed(true);
    surface.setWireframeDisplayed(true);
    surface.setWireframeColor(Color.BLACK);
    surface.setWireframeWidth(1);
    return surface;
  }

}
