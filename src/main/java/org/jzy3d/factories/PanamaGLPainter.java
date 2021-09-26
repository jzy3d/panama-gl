package org.jzy3d.factories;

import static opengl.glut_h.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.painters.AbstractPainter;
import org.jzy3d.painters.ColorModel;
import org.jzy3d.painters.Font;
import org.jzy3d.painters.ListMode;
import org.jzy3d.painters.PixelStore;
import org.jzy3d.painters.RenderMode;
import org.jzy3d.plot3d.primitives.PolygonFill;
import org.jzy3d.plot3d.primitives.PolygonMode;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.lights.Attenuation.Type;
import org.jzy3d.plot3d.rendering.lights.LightModel;
import org.jzy3d.plot3d.rendering.lights.MaterialProperty;

public class PanamaGLPainter extends AbstractPainter{

  public PanamaGLPainter() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public Object acquireGL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void releaseGL() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void configureGL(Quality quality) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMaterial(MaterialProperty material, Color color, boolean b) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMaterial(MaterialProperty material, float[] value, boolean b) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public int[] getViewPortAsInt() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public double[] getProjectionAsDouble() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public float[] getProjectionAsFloat() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public double[] getModelViewAsDouble() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public float[] getModelViewAsFloat() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void glLoadIdentity() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPushMatrix() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPopMatrix() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMatrixMode(int mode) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glScalef(float x, float y, float z) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glTranslatef(float x, float y, float z) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glRotatef(float angle, float x, float y, float z) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDepthFunc(int func) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDepthRangef(float near, float far) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBlendFunc(int sfactor, int dfactor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin(int type) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnd() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glColor3f(float r, float g, float b) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glColor4f(float r, float g, float b, float a) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glVertex3f(float x, float y, float z) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glVertex3d(double x, double y, double z) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable(int type) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable(int type) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glFrontFace(int mode) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glCullFace(int mode) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPolygonMode(PolygonMode mode, PolygonFill fill) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPolygonMode(int frontOrBack, int fill) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPolygonOffset(float factor, float units) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLineStipple(int factor, short pattern) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLineWidth(float width) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPointSize(float width) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glTexCoord2f(float s, float t) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glTexEnvf(int target, int pname, float param) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glTexEnvi(int target, int pname, int param) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public int glGenLists(int range) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void glNewList(int list, int mode) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glNewList(int list, ListMode compile) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEndList() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glCallList(int list) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean glIsList(int list) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void glDeleteLists(int list, int range) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDrawPixels(int width, int height, int format, int type, Buffer pixels) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPixelZoom(float xfactor, float yfactor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPixelStorei(int pname, int param) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPixelStore(PixelStore unpackAlignment, int param) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glRasterPos3f(float x, float y, float z) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove,
      byte[] bitmap, int bitmap_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void drawImage(ByteBuffer imageBuffer, int imageWidth, int imageHeight, Coord2d pixelZoom,
      Coord3d imagePosition) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glutBitmapString(int font, String string) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public int glutBitmapLength(int font, String string) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void glutBitmapString(Font axisFont, String label, Coord3d p, Color c) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public int getTextLengthInPixels(int font, String string) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getTextLengthInPixels(Font font, String string) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void drawText(Font font, String label, Coord3d position, Color color, float rotation) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glOrtho(double left, double right, double bottom, double top, double near_val,
      double far_val) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void gluPerspective(double fovy, double aspect, double zNear, double zFar) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glFrustum(double left, double right, double bottom, double top, double zNear,
      double zFar) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void gluLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY,
      float centerZ, float upX, float upY, float upZ) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glViewport(int x, int y, int width, int height) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glClipPlane(int plane, double[] equation) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_ClipPlane(int plane) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_ClipPlane(int plane) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean gluUnProject(float winX, float winY, float winZ, float[] model, int model_offset,
      float[] proj, int proj_offset, int[] view, int view_offset, float[] objPos,
      int objPos_offset) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean gluProject(float objX, float objY, float objZ, float[] model, int model_offset,
      float[] proj, int proj_offset, int[] view, int view_offset, float[] winPos,
      int winPos_offset) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void gluDisk(double inner, double outer, int slices, int loops) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glutSolidSphere(double radius, int slices, int stacks) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void gluSphere(double radius, int slices, int stacks) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void gluCylinder(double base, double top, double height, int slices, int stacks) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glutSolidCube(float size) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glFeedbackBuffer(int size, int type, FloatBuffer buffer) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public int glRenderMode(int mode) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int glRenderMode(RenderMode mode) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void glPassThrough(float token) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glGetIntegerv(int pname, int[] data, int data_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glGetDoublev(int pname, double[] params, int params_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glGetFloatv(int pname, float[] data, int data_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glNormal3f(float nx, float ny, float nz) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glShadeModel(int mode) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glShadeModel(ColorModel colorModel) {
    if(ColorModel.SMOOTH.equals(colorModel)) {
      glShadeModel(GL_SMOOTH());
    }
    else if(ColorModel.FLAT.equals(colorModel)) {
      glShadeModel(GL_FLAT());
    }
  }

  @Override
  public void glShadeModel_Smooth() {
    glShadeModel(GL_SMOOTH());
  }

  @Override
  public void glShadeModel_Flat() {
    glShadeModel(GL_FLAT());
  }

  @Override
  public void glLightf(int light, Type type, float value) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLightf(int light, int pname, float value) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLightfv(int light, int pname, float[] params, int params_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLightModeli(int mode, int value) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLightModelfv(int mode, float[] value) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLightModel(LightModel model, boolean value) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLightModel(LightModel model, Color color) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMaterialfv(int face, int pname, float[] params, int params_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glHint(int target, int mode) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glClearColor(float red, float green, float blue, float alpha) {
    glClearColor(red, green, blue, alpha);    
  }

  @Override
  public void glClearDepth(double d) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glClear(int mask) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glClearColorAndDepthBuffers() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glInitNames() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLoadName(int name) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPushName(int name) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glPopName() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glSelectBuffer(int size, IntBuffer buffer) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void gluPickMatrix(double x, double y, double delX, double delY, int[] viewport,
      int viewport_offset) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glFlush() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEvalCoord2f(float u, float v) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2,
      int vstride, int vorder, FloatBuffer points) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_Blend() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_Blend() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMatrixMode_ModelView() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glMatrixMode_Projection() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_Polygon() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_Quad() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_Triangle() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_Point() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_LineStrip() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_LineLoop() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glBegin_Line() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_LineStipple() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_LineStipple() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_PolygonOffsetFill() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_PolygonOffsetFill() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_PolygonOffsetLine() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_PolygonOffsetLine() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_CullFace() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_CullFace() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glFrontFace_ClockWise() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glCullFace_Front() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_Lighting() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_Lighting() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_Light(int light) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glDisable_Light(int light) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLight_Position(int lightId, float[] positionZero) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLight_Ambiant(int lightId, Color ambiantColor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLight_Diffuse(int lightId, Color diffuseColor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glLight_Specular(int lightId, Color specularColor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_ColorMaterial() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glEnable_PointSmooth() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void glHint_PointSmooth_Nicest() {
    // TODO Auto-generated method stub
    
  }

}
