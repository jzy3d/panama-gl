package org.jzy3d.chart.factories;

import org.jzy3d.chart.factories.ChartFactory;
import org.jzy3d.chart.factories.IPainterFactory;

public class PanamaGLChartFactory extends ChartFactory {

  public PanamaGLChartFactory() {
    super(new PanamaGLPainterFactory());
  }

  public PanamaGLChartFactory(IPainterFactory painterFactory) {
    super(painterFactory);
  }
}
