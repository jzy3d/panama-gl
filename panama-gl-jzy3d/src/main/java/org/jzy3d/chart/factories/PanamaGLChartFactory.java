package org.jzy3d.chart.factories;

public class PanamaGLChartFactory extends ChartFactory {

  public PanamaGLChartFactory() {
    super(new PanamaGLPainterFactory_MacOS_10_15_3());
  }

  public PanamaGLChartFactory(IPainterFactory painterFactory) {
    super(painterFactory);
  }
}
