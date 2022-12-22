package opengl.fbo;

import opengl.GL;
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
public class DemoFBO_Onscreen {

  public static void main(String[] args) throws Exception{
    JFrame frame = new JFrame("Rendering offscreen with Panama GL");
    frame.getContentPane().setLayout(new BorderLayout());
    frame.pack();
    frame.setBounds(0,0, 800, 600);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Thread.join();
    //Thread.sleep(1000);

    GL gl = new GL_macOS_10_15_3(false);

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

    //pixelsRead.
    try {
      ImageIO.write(out, "png", new File("target/DemoFBO-Onscreen.png"));

    } catch (Exception e) {
      e.printStackTrace();
    }

    //-------------------------
    // Show in a JPanel

    JPanel panel = new JPanel(){
      @Override
      public void paintComponent(Graphics g) {
        g.drawImage(out, 0, 0, null);
      }
    };
    panel.addComponentListener(new ComponentAdapter() {
      @Override
      public void componentResized(ComponentEvent e) {
        super.componentResized(e);

        Dimension size = e.getComponent().getSize();
        fbo.resize((int)Math.round(size.getWidth()), (int)Math.round(size.getHeight()));
      }
    });


    frame.add(panel, BorderLayout.CENTER);


  }
}
