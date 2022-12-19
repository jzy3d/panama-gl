package opengl.fbo;

import jdk.incubator.foreign.*;
import opengl.GL;
import opengl.macos.GL_macOS_10_15_3;
import opengl.macos.v10_15_3.glut_h;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.ResourceScope.newImplicitScope;
import static opengl.macos.v10_15_3.glut_h.*;

/**
 * https://github.com/jzy3d/panama-gl/issues/5
 */
// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class DemoFBO_Object2 {

  public static void main(String[] args) {
    GL gl = new GL_macOS_10_15_3();

    //-------------------------
    // Prepare VBO
    FBO fbo = new FBO();
    fbo.prepare(gl);

    //-------------------------
    // Render something
    SampleTriangle.sceneDemo();

    //-------------------------
    // Get image
    BufferedImage out = fbo.getImage(gl);

    //pixelsRead.
    try {
      ImageIO.write(out, "png", new File("target/outFBO.png"));

    } catch (Exception e) {
      e.printStackTrace();
    }




  }

  private static void sceneDemo() {
    glViewport(0, 0, 256, 256);
    glMatrixMode(GL_PROJECTION());
    glLoadIdentity();
    glOrtho(0.0, 256.0, 0.0, 256.0, -1.0, 1.0);
    glMatrixMode(GL_MODELVIEW());
    glLoadIdentity();

    //-------------------------
    glDisable(GL_TEXTURE_2D());
    glDisable(GL_BLEND());
    glEnable(GL_DEPTH_TEST());

    //-------------------------
    //**************************
    //RenderATriangle, {0.0, 0.0}, {256.0, 0.0}, {256.0, 256.0}
    //Read http://www.opengl.org/wiki/VBO_-_just_examples
    //RenderATriangle();

    glut_h.glBegin(glut_h.GL_TRIANGLES());
    //glut_h.glBegin(glut_h.GL_POINT());
    glut_h.glVertex2f(0,0);
    glut_h.glColor3f(1,0,0);
    glut_h.glVertex2f(256,0);
    glut_h.glColor3f(0,1,0);
    glut_h.glVertex2f(256,256);
    glut_h.glColor3f(0,0,1);
    glut_h.glEnd();
  }
}
