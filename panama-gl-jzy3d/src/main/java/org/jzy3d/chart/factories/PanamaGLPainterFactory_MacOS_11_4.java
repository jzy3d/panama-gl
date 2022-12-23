package org.jzy3d.chart.factories;

import org.jzy3d.painters.IPainter;
import org.jzy3d.painters.PanamaGLPainter_MacOS_11_4;

public class PanamaGLPainterFactory_MacOS_11_4 extends AbstractPanamaGLPainterFactory {


  public PanamaGLPainterFactory_MacOS_11_4() {
  }

  @Override
  public IPainter newPainter() {
    return new PanamaGLPainter_MacOS_11_4();
  }

  ///////////////////////

}
