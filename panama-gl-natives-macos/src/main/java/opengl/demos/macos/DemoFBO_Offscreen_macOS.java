package opengl.demos.macos;

import opengl.GL;
import opengl.GLContext;
import opengl.glut.macos.GLUTContext_macOS_10_15_7;
import opengl.macos.GL_macOS_10_15_7;

/**
 * https://github.com/jzy3d/panama-gl/issues/5
 */
// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class DemoFBO_Offscreen_macOS {

  public static void main(String[] args) {
    GLContext context = new GLUTContext_macOS_10_15_7();
    context.init();

    GL gl = new GL_macOS_10_15_7();

    opengl.demos.DemoFBO_Offscreen_macOS.fbo_offscreen(gl);
  }
}
