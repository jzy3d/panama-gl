package org.jzy3d.chart.factories;

import org.jzy3d.painters.IPainter;
import org.jzy3d.painters.PanamaGLPainter_Ubuntu_20_04;

public class PanamaGLPainterFactory_Ubuntu_20_04 extends AbstractPanamaGLPainterFactory {


  public PanamaGLPainterFactory_Ubuntu_20_04() {
  }

  @Override
  public IPainter newPainter() {
    return new PanamaGLPainter_Ubuntu_20_04();
  }

  ///////////////////////

}
