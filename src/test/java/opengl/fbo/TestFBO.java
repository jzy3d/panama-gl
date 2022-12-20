package opengl.fbo;

import opengl.GL;
import opengl.macos.GL_macOS_10_15_3;
import opengl.macos.v10_15_3.glut_h;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static opengl.macos.v10_15_3.glut_h.*;

// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class TestFBO {
    @Test
    public void givenFBO_whenRenderSomething_ThenGetBufferedImage(){
        String file = "target/" +TestFBO.class.getSimpleName() + "-givenFBO_whenRenderSomething_ThenGetBufferedImage.png";

        // Given a GL context
        GL gl = new GL_macOS_10_15_3();

        // Given a FBO prepared with this context
        FBO fbo = new FBO();
        fbo.prepare(gl);

        // When Render something and get image
        SampleTriangle.sceneDemo();
        BufferedImage out = fbo.getImage(gl);

        // Then image is saved
        saveImage(file, out);

        // Then image pixel
        // is red
        // is blue
        // is green
    }

    private void saveImage(String file, BufferedImage out) {
        try {
            ImageIO.write(out, "png", new File(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
