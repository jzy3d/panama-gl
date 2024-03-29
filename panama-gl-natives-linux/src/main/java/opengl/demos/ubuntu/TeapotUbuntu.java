package opengl.demos.ubuntu;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static opengl.ubuntu.v20.glut_h.GL_AMBIENT;
import static opengl.ubuntu.v20.glut_h.GL_COLOR_BUFFER_BIT;
import static opengl.ubuntu.v20.glut_h.GL_DEPTH_BUFFER_BIT;
import static opengl.ubuntu.v20.glut_h.GL_DEPTH_TEST;
import static opengl.ubuntu.v20.glut_h.GL_DIFFUSE;
import static opengl.ubuntu.v20.glut_h.GL_FRONT;
import static opengl.ubuntu.v20.glut_h.GL_LIGHT0;
import static opengl.ubuntu.v20.glut_h.GL_LIGHTING;
import static opengl.ubuntu.v20.glut_h.GL_POSITION;
import static opengl.ubuntu.v20.glut_h.GL_SHININESS;
import static opengl.ubuntu.v20.glut_h.GL_SMOOTH;
import static opengl.ubuntu.v20.glut_h.GL_SPECULAR;
import static opengl.ubuntu.v20.glut_h.GLUT_DEPTH;
import static opengl.ubuntu.v20.glut_h.GLUT_DOUBLE;
import static opengl.ubuntu.v20.glut_h.GLUT_RGB;
import static opengl.ubuntu.v20.glut_h.glClear;
import static opengl.ubuntu.v20.glut_h.glClearColor;
import static opengl.ubuntu.v20.glut_h.glEnable;
import static opengl.ubuntu.v20.glut_h.glLightfv;
import static opengl.ubuntu.v20.glut_h.glMaterialfv;
import static opengl.ubuntu.v20.glut_h.glPopMatrix;
import static opengl.ubuntu.v20.glut_h.glPushMatrix;
import static opengl.ubuntu.v20.glut_h.glRotatef;
import static opengl.ubuntu.v20.glut_h.glShadeModel;
import static opengl.ubuntu.v20.glut_h.glutCreateWindow;
import static opengl.ubuntu.v20.glut_h.glutDisplayFunc;
import static opengl.ubuntu.v20.glut_h.glutIdleFunc;
import static opengl.ubuntu.v20.glut_h.glutInit;
import static opengl.ubuntu.v20.glut_h.glutInitDisplayMode;
import static opengl.ubuntu.v20.glut_h.glutInitWindowSize;
import static opengl.ubuntu.v20.glut_h.glutMainLoop;
import static opengl.ubuntu.v20.glut_h.glutPostRedisplay;
import static opengl.ubuntu.v20.glut_h.glutSolidTeapot;
import static opengl.ubuntu.v20.glut_h.glutSwapBuffers;

/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.ubuntu.v20.glutDisplayFunc$callback;
import opengl.ubuntu.v20.glutIdleFunc$callback;

/**
 * This is the original demonstration program provided at https://github.com/sundararajana/panama-jextract-samples/tree/master/opengl.
 *
 * Requires VM args for Ubuntu
 * <code>
 * --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/usr/lib/x864-linux-gnu/
 * </code>
 */
public class TeapotUbuntu {
  private float rot = 0;

  TeapotUbuntu(SegmentAllocator allocator) {
    // Reset Background
    glClearColor(0f, 0f, 0f, 0f);
    // Setup Lighting
    glShadeModel(GL_SMOOTH());
    var pos = allocator.allocateArray(C_FLOAT, new float[] { 0.0f, 15.0f, -15.0f, 0 });
    glLightfv(GL_LIGHT0(), GL_POSITION(), pos);
    var spec = allocator.allocateArray(C_FLOAT, new float[] { 1, 1, 1, 0 });
    glLightfv(GL_LIGHT0(), GL_AMBIENT(), spec);
    glLightfv(GL_LIGHT0(), GL_DIFFUSE(), spec);
    glLightfv(GL_LIGHT0(), GL_SPECULAR(), spec);
    var shini = allocator.allocate(C_FLOAT, 113);
    glMaterialfv(GL_FRONT(), GL_SHININESS(), shini);
    glEnable(GL_LIGHTING());
    glEnable(GL_LIGHT0());
    glEnable(GL_DEPTH_TEST());
  }

  void display() {
    glClear(GL_COLOR_BUFFER_BIT() | GL_DEPTH_BUFFER_BIT());
    glPushMatrix();
    glRotatef(-20f, 1f, 1f, 0f);
    glRotatef(rot, 0f, 1f, 0f);
    glutSolidTeapot(0.5d);
    glPopMatrix();
    glutSwapBuffers();

  }

  void onIdle() {
    rot += 0.1;
    glutPostRedisplay();
    //throw new IllegalArgumentException("Teapot does not support coffee");
  }

  public static void main(String[] args) {
    try (var scope = ResourceScope.newConfinedScope()) {
      var allocator = SegmentAllocator.ofScope(scope);
      var argc = allocator.allocate(C_INT, 0);
      glutInit(argc, argc);
      glutInitDisplayMode(GLUT_DOUBLE() | GLUT_RGB() | GLUT_DEPTH());
      glutInitWindowSize(500, 500);
      glutCreateWindow(CLinker.toCString("Hello Panama!", scope));
      var teapot = new TeapotUbuntu(allocator);
      var displayStub = glutDisplayFunc$callback.allocate(teapot::display, scope);
      var idleStub = glutIdleFunc$callback.allocate(teapot::onIdle, scope);
      glutDisplayFunc(displayStub);
      glutIdleFunc(idleStub);
      glutMainLoop();
    }
  }
}
