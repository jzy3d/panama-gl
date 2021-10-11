package org.jzy3d.chart.factories;

import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.mouse.camera.ICameraMouseController;
import org.jzy3d.chart.controllers.thread.camera.CameraThreadController;
import org.jzy3d.plot3d.rendering.view.lod.LODPerf;

public class PanamaGLMouse implements ICameraMouseController{

  public PanamaGLMouse() {
  }

  public PanamaGLMouse(Chart chart) {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void addSlaveThreadController(CameraThreadController thread) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public CameraThreadController getSlaveThreadController() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addThread(CameraThreadController thread) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public CameraThreadController getThread() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isUpdateViewDefault() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void setUpdateViewDefault(boolean updateViewDefault) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setLODPerf(LODPerf perf) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public LODPerf getLODPerf() {
    // TODO Auto-generated method stub
    return null;
  }

}
