package opengl.fbo;

import opengl.macos.v10_15_3.glut_h;

import static opengl.macos.v10_15_3.glut_h.*;

public class SampleTriangle {
    public static void sceneDemo() {
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

        glut_h.glBegin(glut_h.GL_TRIANGLES());
        glut_h.glVertex2f(0,0);
        glut_h.glColor3f(1,0,0);
        glut_h.glVertex2f(256,0);
        glut_h.glColor3f(0,1,0);
        glut_h.glVertex2f(256,256);
        glut_h.glColor3f(0,0,1);
        glut_h.glEnd();
    }
}
