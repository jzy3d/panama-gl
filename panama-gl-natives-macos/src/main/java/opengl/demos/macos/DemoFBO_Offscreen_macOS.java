package opengl.demos.macos;

import opengl.GL;
import opengl.demos.DemoFBO_Offscreen;
import opengl.macos.GL_macOS_10_15_3;

/**
 * https://github.com/jzy3d/panama-gl/issues/5
 */
// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class DemoFBO_Offscreen_macOS {

  public static void main(String[] args) {
    GL gl = new GL_macOS_10_15_3(true);

    DemoFBO_Offscreen.fbo_offscreen(gl);
  }
}
