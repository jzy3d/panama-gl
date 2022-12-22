package opengl.demos;

import opengl.GL;
import opengl.fbo.FBO;
import opengl.macos.GL_macOS_10_15_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * https://github.com/jzy3d/panama-gl/issues/5
 */
// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class DemoFBO_Offscreen {
  public static void fbo_offscreen(GL gl) {
    //-------------------------
    // Prepare VBO
    int width = 256;
    int height = 256;
    FBO fbo = new FBO(width, height);
    fbo.prepare(gl);

    //-------------------------
    // Render something
    SampleTriangle.rgbaTriangle2D(width, height);

    //-------------------------
    // Get image
    BufferedImage out = fbo.getImage(gl);

    saveImage(out);

    fbo.release(gl);
  }

  private static void saveImage(BufferedImage out) {
    try {
      ImageIO.write(out, "png", new File("target/outFBO.png"));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
