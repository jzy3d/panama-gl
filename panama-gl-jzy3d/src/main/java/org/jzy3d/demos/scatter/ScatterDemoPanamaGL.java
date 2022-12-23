package org.jzy3d.demos.scatter;

import java.util.Random;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.IChartFactory;
import org.jzy3d.chart.factories.PanamaGLChartFactory;
import org.jzy3d.chart.factories.PanamaGLPainterFactory_MacOS_10_15_3;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.plot3d.primitives.Scatter;
import org.jzy3d.plot3d.rendering.canvas.Quality;


public class ScatterDemoPanamaGL  {
  public static void main(String[] args) {
    IChartFactory f = new PanamaGLChartFactory(new PanamaGLPainterFactory_MacOS_10_15_3());
    Chart chart = f.newChart(Quality.Advanced());
    chart.add(scatter());

    // Manual HiDPI setting
    float[] pixelScale = {2f,2f};
    chart.getCanvas().setPixelScale(pixelScale);

    chart.open(800,600);
  }

  private static Scatter scatter() {
    int size = 500000;
    float x;
    float y;
    float z;
    float a;

    Coord3d[] points = new Coord3d[size];
    Color[] colors = new Color[size];

    Random r = new Random();
    r.setSeed(0);

    for (int i = 0; i < size; i++) {
      x = r.nextFloat() - 0.5f;
      y = r.nextFloat() - 0.5f;
      z = r.nextFloat() - 0.5f;
      points[i] = new Coord3d(x, y, z);
      a = 0.25f;
      colors[i] = new Color(x, y, z, a);
    }

    return new Scatter(points, colors);
  }
}
