package opengl.fbo;

import org.junit.Test;
import org.jzy3d.os.OperatingSystem;
import opengl.GL;
import opengl.macos.GL_macOS_10_15_3;

// VM ARGS : -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
public class TestFBO_macOS {

    @Test
    public void givenFBO_whenRenderSomething_ThenGetBufferedImage(){
        OperatingSystem os = new OperatingSystem();
        if(!os.isMac())
          return;
        
        // Given a GL context
        GL gl = new GL_macOS_10_15_3(true);
        
        TestFBO.givenFBO_whenRenderSomething_ThenGetBufferedImage(gl);

    }

    


}
