package opengl.fbo.macos;

import opengl.macos.GL_macOS_10_15_3;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class TestGL_macOS_10_15_3 {
    @Test
    public void whenInitDefault_ThenDoNotInvokeGlut(){

        GL_macOS_10_15_3 gl = spy(GL_macOS_10_15_3.class);


    }
}
