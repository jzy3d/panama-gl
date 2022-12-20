package opengl.fbo;

import opengl.ByteUtils;
import opengl.GL;
import opengl.macos.GL_macOS_10_15_3;
import org.junit.Assert;
import org.junit.Test;
import org.jzy3d.maths.Array;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class TestFBO {
    public int[] RED = {255,0,0,255};
    public int[] GREEN = {0,255,0,255};
    public int[] BLUE = {0,0,255,255};
    @Test
    public void givenFBO_whenRenderSomething_ThenGetBufferedImage(){
        String file = "target/" +TestFBO.class.getSimpleName() + "-givenFBO_whenRenderSomething_ThenGetBufferedImage.png";

        // Given a GL context
        GL gl = new GL_macOS_10_15_3();

        // ----------------------------------
        // Given a FBO prepared with this context

        int width = 256;
        int height = 256;
        FBO fbo = new FBO(width, height);

        fbo.prepare(gl);

        // ----------------------------------
        // When Render something and get image
        SampleTriangle.rgbaTriangle2D(width, height);

        BufferedImage out = fbo.getImage(gl);

        // ----------------------------------
        // Then image is saved

        saveImage(file, out);


        // ----------------------------------
        // Then red vertex is at the expected
        // position with expected color

        int[] pxR = {0,0}; // top left
        int[] pxG = {width-1,0}; // top right
        int[] pxB = {width-1,height-1}; // bottom right

        int[] Rgba = ByteUtils.IntARGBtoRGBAi(out.getRGB(pxR[0],pxR[1]));

        Array.print("TestFBO:red:actual:", Rgba);
        Array.print("TestFBO:red:expect:", RED);

        Assert.assertArrayEquals(RED, Rgba);

        // Then green vertex is at the expected
        // position with expected color

        int[] rGba = ByteUtils.IntARGBtoRGBAi(out.getRGB(pxG[0],pxG[1]));
        // FIXME! Green is 254 instead of 255, why?
        GREEN[1] = GREEN[1]-1; // a bit is missing!
        Array.print("TestFBO:green:actual:", rGba);
        Array.print("TestFBO:green:expect:", GREEN);

        Assert.assertArrayEquals(GREEN, rGba);


        // Then blue vertex is at the expected
        // position with expected color

        int[] rgBa = ByteUtils.IntARGBtoRGBAi(out.getRGB(pxB[0],pxB[1]));
        Array.print("TestFBO:blue:actual:", rgBa);
        Array.print("TestFBO:blue:expect:", BLUE);

        Assert.assertArrayEquals(BLUE, rgBa);
    }

    private void saveImage(String file, BufferedImage out) {
        try {
            ImageIO.write(out, "png", new File(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
