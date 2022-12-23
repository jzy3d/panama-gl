package org.jzy3d.demos.surface;

import static jdk.incubator.foreign.CLinker.C_INT;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.factories.ChartFactory;
import org.jzy3d.chart.factories.PanamaGLChartFactory;
import org.jzy3d.chart.factories.PanamaGLPainterFactory_MacOS_10_15_3;
import org.jzy3d.colors.Color;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Func3D;
import org.jzy3d.plot3d.builder.SurfaceBuilder;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.macos.v10_15_3.glut_h;


/**
 * Demo an surface chart made with Panama (JEP-412).
 *
 * @author Martin Pernollet
 *
 */
public class SurfaceDemoPanamaGL_macOs {

  static final float ALPHA_FACTOR = 0.55f;// .61f;

  public static void main(String[] args) {
    // https://github.com/jzy3d/panama-gl/issues/16
    var scope = ResourceScope.newConfinedScope();
    var allocator = SegmentAllocator.ofScope(scope);
    var argc = allocator.allocate(C_INT, 0);
    glut_h.glutInit(argc, argc);
    
    // ------------------------

    Shape surface = surface();

    /**
     * In case the below factory is not working, one can use CPU rendering fallback as follow
     * <code>
     * ChartFactory factory = new EmulGLChartFactory(); // use me as a reference
     * </code>
     *
     * @see https://github.com/jzy3d/jzy3d-api/blob/master/jzy3d-tutorials/src/main/java/org/jzy3d/demos/surface/SurfaceDemoEmulGL.java
     */
    ChartFactory factory = new PanamaGLChartFactory(new PanamaGLPainterFactory_MacOS_10_15_3());
    //ChartFactory factory = new PanamaGLChartFactory(new PanamaGLPainterFactory_MacOS_11_4());
    //ChartFactory factory = new PanamaGLChartFactory(new PanamaGLPainterFactory_Ubuntu_20_04());

    Quality q = Quality.Advanced();
    Chart chart = factory.newChart(q);
    chart.add(surface());

    // Manual HiDPI setting
    //float[] pixelScale = {2f,2f};
    //chart.getCanvas().setPixelScale(pixelScale);

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
