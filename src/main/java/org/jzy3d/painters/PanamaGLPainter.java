package org.jzy3d.painters;

import static jdk.incubator.foreign.CLinker.*;
import static jdk.incubator.foreign.CLinker.C_INT;
import static opengl.glut_h.*;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;


import org.apache.log4j.Logger;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Array;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.painters.AbstractPainter;
import org.jzy3d.painters.ColorModel;
import org.jzy3d.painters.Font;
import org.jzy3d.painters.ListMode;
import org.jzy3d.painters.PixelStore;
import org.jzy3d.painters.RenderMode;
import org.jzy3d.plot3d.pipelines.NotImplementedException;
import org.jzy3d.plot3d.primitives.PolygonFill;
import org.jzy3d.plot3d.primitives.PolygonMode;
import org.jzy3d.plot3d.rendering.canvas.EmulGLCanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import jgl.wt.awt.GL;
import org.jzy3d.plot3d.rendering.lights.Attenuation;
import org.jzy3d.plot3d.rendering.lights.LightModel;
import org.jzy3d.plot3d.rendering.lights.MaterialProperty;
import com.jogamp.opengl.fixedfunc.GLLightingFunc;

public class PanamaGLPainter extends AbstractPainter {
  static Logger logger = Logger.getLogger(PanamaGLPainter.class);
  
  ResourceScope scope;
  SegmentAllocator allocator;

  public PanamaGLPainter() {
    try {
      scope = ResourceScope.newConfinedScope();
      allocator = SegmentAllocator.ofScope(scope);
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println(e);
    }
  }
  
  /////////////////////////////////////////////
  
  public ResourceScope getScope() {
    return scope;
  }

  public SegmentAllocator getAllocator() {
    return allocator;
  }

  public MemorySegment alloc(double[] value) {
    return allocator.allocateArray(C_DOUBLE, value);
  }

  public MemorySegment alloc(float[] value) {
    return allocator.allocateArray(C_FLOAT, value);
  }

  public MemorySegment alloc(int[] value) {
    return allocator.allocateArray(C_INT, value);
  }

  public MemorySegment alloc(String value) {
    return CLinker.toCString(value, scope);
  }
  
  /////////////////////////////////////////////

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

    // Activate Depth buffer
    if (quality.isDepthActivated()) {
      opengl.glut_h.glEnable(opengl.glut_h.GL_DEPTH_TEST());
      opengl.glut_h.glDepthFunc(opengl.glut_h.GL_LESS());
    } else {
      opengl.glut_h.glDisable(opengl.glut_h.GL_DEPTH_TEST());
    }

    // Blending : more beautifull with jGL without this
    opengl.glut_h.glBlendFunc(opengl.glut_h.GL_SRC_ALPHA(), opengl.glut_h.GL_ONE_MINUS_SRC_ALPHA());

    // GL_SRC_ALPHA_SATURATE
    // on/off is handled by each viewport (camera or image)

    // Activate tranparency
    if (quality.isAlphaActivated()) {
      opengl.glut_h.glEnable(opengl.glut_h.GL_BLEND());
      opengl.glut_h.glEnable(opengl.glut_h.GL_ALPHA_TEST());

      if (quality.isDisableDepthBufferWhenAlpha()) {
        // Disable depth test to keeping pixels of
        // "what's behind a polygon" when drawing with
        // alpha
        opengl.glut_h.glDisable(opengl.glut_h.GL_DEPTH_TEST());
      }
    } else {
      opengl.glut_h.glDisable(opengl.glut_h.GL_ALPHA_TEST());
    }

    // Make smooth colors for polygons (interpolate color between points)
    glShadeModel(quality.getColorModel());

    // Make smoothing setting
    if (quality.isSmoothPolygon()) {
      opengl.glut_h.glEnable(opengl.glut_h.GL_POLYGON_SMOOTH());
    } else
      opengl.glut_h.glDisable(opengl.glut_h.GL_POLYGON_SMOOTH());

    if (quality.isSmoothLine()) {
      opengl.glut_h.glEnable(opengl.glut_h.GL_LINE_SMOOTH());
    } else
      opengl.glut_h.glDisable(opengl.glut_h.GL_LINE_SMOOTH());

    if (quality.isSmoothPoint()) {
      opengl.glut_h.glEnable(opengl.glut_h.GL_POINT_SMOOTH());
    } else
      opengl.glut_h.glDisable(opengl.glut_h.GL_POINT_SMOOTH());
    
  }

  @Override
  public int[] getViewPortAsInt() {
    int viewport[] = new int[4];
    glGetIntegerv(opengl.glut_h.GL_VIEWPORT(), viewport, 0);
    return viewport;
  }

  @Override
  public double[] getProjectionAsDouble() {
    double projection[] = new double[16];
    glGetDoublev(opengl.glut_h.GL_PROJECTION_MATRIX(), projection, 0);
    return projection;
  }

  @Override
  public float[] getProjectionAsFloat() {
    float projection[] = new float[16];
    glGetFloatv(opengl.glut_h.GL_PROJECTION_MATRIX(), projection, 0);
    return projection;
  }

  @Override
  public double[] getModelViewAsDouble() {
    double modelview[] = new double[16];
    glGetDoublev(opengl.glut_h.GL_MODELVIEW_MATRIX(), modelview, 0);
    return modelview;
  }

  @Override
  public float[] getModelViewAsFloat() {
    float modelview[] = new float[16];
    glGetFloatv(opengl.glut_h.GL_MODELVIEW_MATRIX(), modelview, 0);
    return modelview;
  }

  /************ OPEN GL Interface **************/

  // GL MATRIX

  @Override
  public void glPushMatrix() {
    opengl.glut_h.glPushMatrix();
  }

  @Override
  public void glPopMatrix() {
    opengl.glut_h.glPopMatrix();
  }

  @Override
  public void glMatrixMode(int mode) {
    opengl.glut_h.glMatrixMode(mode);
  }

  @Override
  public void glLoadIdentity() {
    opengl.glut_h.glLoadIdentity();
  }

  @Override
  public void glScalef(float x, float y, float z) {
    opengl.glut_h.glScalef(x, y, z);
  }

  @Override
  public void glTranslatef(float x, float y, float z) {
    opengl.glut_h.glTranslatef(x, y, z);
  }

  @Override
  public void glRotatef(float angle, float x, float y, float z) {
    opengl.glut_h.glRotatef(angle, x, y, z);
  }

  @Override
  public void glEnable(int type) {
    opengl.glut_h.glEnable(type);
  }

  @Override
  public void glDisable(int type) {
    opengl.glut_h.glDisable(type);
  }

  // GL GEOMETRY

  @Override
  public void glPointSize(float width) {
    opengl.glut_h.glPointSize(width);
  }

  @Override
  public void glLineWidth(float width) {
    opengl.glut_h.glLineWidth(width);
  }

  @Override
  public void glBegin(int type) {
    opengl.glut_h.glBegin(type);
  }

  @Override
  public void glColor3f(float r, float g, float b) {
    opengl.glut_h.glColor3f(r, b, b);
  }

  @Override
  public void glColor4f(float r, float g, float b, float a) {
    opengl.glut_h.glColor4f(r, g, b, a);
  }

  @Override
  public void glVertex3f(float x, float y, float z) {
    opengl.glut_h.glVertex3f(x, y, z);
  }

  @Override
  public void glVertex3d(double x, double y, double z) {
    opengl.glut_h.glVertex3d(x, y, z);
  }

  @Override
  public void glEnd() {
    opengl.glut_h.glEnd();
  }

  @Override
  public void glFrontFace(int mode) {
    opengl.glut_h.glFrontFace(mode);
  }

  @Override
  public void glCullFace(int mode) {
    opengl.glut_h.glCullFace(mode);
  }

  @Override
  public void glPolygonMode(PolygonMode mode, PolygonFill fill) {
    int modeValue = polygonModeValue(mode);
    int fillValue = polygonFillValue(fill);

    glPolygonMode(modeValue, fillValue);
  }

  protected int polygonModeValue(PolygonMode mode) {
    switch (mode) {
    case FRONT:
      return opengl.glut_h.GL_FRONT();
    case BACK:
      return opengl.glut_h.GL_BACK();
    case FRONT_AND_BACK:
      return opengl.glut_h.GL_FRONT_AND_BACK();
    default:
      throw new IllegalArgumentException("Unsupported mode '" + mode + "'");
    }
  }

  protected int polygonFillValue(PolygonFill mode) {
    switch (mode) {
    case FILL:
      return opengl.glut_h.GL_FILL();
    case LINE:
      return opengl.glut_h.GL_LINE();
    default:
      throw new IllegalArgumentException("Unsupported mode '" + mode + "'");
    }
  }

  @Override
  public void glPolygonMode(int frontOrBack, int fill) {
    opengl.glut_h.glPolygonMode(frontOrBack, fill);
  }

  /**
   * @see {@link #glEnable_PolygonOffsetFill()}
   */
  @Override
  public void glPolygonOffset(float factor, float units) {
    // throw new NotImplementedException(OFFSET_FILL_NOT_IMPLEMENTED);
    // opengl.glut_h.glPolygonOffset(factor, units); // handle stippling
  }

  String OFFSET_FILL_NOT_IMPLEMENTED = "not in jopengl.glut_h. \n"
      + "Was added to OpenGL 2 (https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/glPolygonOffset.xhtml). \n"
      + "You may desactivate offset fill with drawable.setPolygonOffsetFillEnable(false). \n"
      + "More here : https://github.com/jzy3d/jGL/issues/3";

  @Override
  public void glLineStipple(int factor, short pattern) {
    opengl.glut_h.glLineStipple(factor, pattern);
  }

  // GL TEXTURE

  @Override
  public void glTexCoord2f(float s, float t) {
    opengl.glut_h.glTexCoord2f(s, t);
  }

  @Override
  public void glTexEnvf(int target, int pname, float param) {
    opengl.glut_h.glTexEnvf(target, pname, param);
  }

  @Override
  public void glTexEnvi(int target, int pname, int param) {
    opengl.glut_h.glTexEnvi(target, pname, param);
  }

  /**
   * glRasterPos3f not implemented by {@link GL}.
   * 
   * This method will fallback on {@link GL#glRasterPos2f(float, float)} or
   * trigger a {@link NotImplementedException} in case z value is not equal to 0.
   */
  @Override
  public void glRasterPos3f(float x, float y, float z) {
    if (!(z == 0 || Float.isNaN(z)))
      throw new NotImplementedException("z:" + z);
    else
      opengl.glut_h.glRasterPos2f(x, y);
  }

  /**
   * Not working yet.
   */
  @Override
  public void glDrawPixels(int width, int height, int format, int type, Buffer pixels) {
    logger.error("not implemented");

    // opengl.glut_h.glDrawPixels(width, height, format, type, pixels.array());
  }

  // MOVE FOLLOWING TO GLImage


  /**
   * glPixelZoom is not implemented by {@link GL}. This method will do nothing but
   * triggering a {@link NotImplementedException} in case x and y zoom factor are
   * not both equal to 1 (i.e. in case a zoom is needed).
   * 
   */
  @Override
  public void glPixelZoom(float xfactor, float yfactor) {
    if (xfactor != 1 || yfactor != 1)
      throw new NotImplementedException("x:" + xfactor + "y:" + yfactor);
    // opengl.glut_h.glPixelZoom(xfactor, yfactor);
  }

  @Override
  public void glPixelStorei(int pname, int param) {
    opengl.glut_h.glPixelStorei(pname, param);
  }

  @Override
  public void glPixelStore(PixelStore store, int param) {
    switch (store) {
    case PACK_ALIGNMENT:
      opengl.glut_h.glPixelStorei(opengl.glut_h.GL_PACK_ALIGNMENT(), param);
      break;
    case UNPACK_ALIGNMENT:
      opengl.glut_h.glPixelStorei(opengl.glut_h.GL_UNPACK_ALIGNMENT(), param);
      break;
    }
    throw new IllegalArgumentException("Unsupported mode '" + store + "'");
  }

  @Override
  public void glBitmap(int width, int height, float xorig, float yorig, float xmove, float ymove, byte[] bitmap,
      int bitmap_offset) {
    throw new NotImplementedException();
    // opengl.glut_h.glBitmap(width, height, xorig, yorig, xmove, ymove, bitmap,
    // bitmap_offset);
  }

  /**
   * A very failing implementation. SHOULD SUPPORT AWT BufferedImage in EmulGL -
   * or reverse converse
   */
  @Override
  public void drawImage(ByteBuffer imageBuffer, int imageWidth, int imageHeight, Coord2d pixelZoom,
      Coord3d imagePosition) {
    glPixelZoom(pixelZoom.x, pixelZoom.y);
    glRasterPos3f(imagePosition.x, imagePosition.y, 0);
    // painter.glRasterPos2f(xpict, ypict);

    synchronized (imageBuffer) { // we don't want to draw image while it is being set by setImage
      glDrawPixels(imageWidth, imageHeight, GL_RGBA, GL_UNSIGNED_BYTE, imageBuffer);
    }

    // getGL().appendImageToDraw(legendImage, imagePosition.x, imagePosition.y);

  }

  // elements of GL spec picked in JOGL GL interface
  public static final int GL_RGBA = 0x1908;
  public static final int GL_UNSIGNED_BYTE = 0x1401;

  /* ****************************** TEXT *********************************/

  /**
   * Process the given font length to further process alignement.
   * 
   * Will only return a valid width for known {@link Font} (Helevetica and Times
   * Roman).
   * 
   * Getting text width of any string can be done
   * {@link #getTextLengthInPixels(Font, String)}.
   */
  @Override
  public int glutBitmapLength(int font, String string) {
    if (font == Font.BITMAP_HELVETICA_12) {
      return 6 * string.length();
    } else if (font == Font.BITMAP_HELVETICA_18) {
      return 9 * string.length();
    } else if (font == Font.BITMAP_TIMES_ROMAN_10) {
      return 5 * string.length();
    } else if (font == Font.BITMAP_TIMES_ROMAN_24) {
      return 12 * string.length();
    }
    return 6 * string.length();
  }

  boolean allowAutoDetectTextLength = true;

  @Override
  public int getTextLengthInPixels(int font, String string) {
    Font fnt = Font.getById(font);

    return getTextLengthInPixels(fnt, string);
  }

  /**
   * Text length processing based on AWT {@link FontMetrics} obtained by
   * retrieving the graphic context of the {@link GLCanvas}.
   * 
   * In case no graphics is available
   */
  @Override
  public int getTextLengthInPixels(Font font, String string) {
    EmulGLCanvas c = (EmulGLCanvas) getCanvas();
    if (c != null) {
      Graphics g = c.getGraphics();
      if (g != null && font != null) {
        g.setFont(toAWT(font)); // TODO : cache?

        FontMetrics fm = g.getFontMetrics();
        if (fm != null) {
          return fm.stringWidth(string);
        }
      }
    }
    // fallback on glut
    return glutBitmapLength(font.getCode(), string);
  }

  /**
   * Replace {@link #glutBitmapString(int, String) which is the official OpenGL
   * interface.
   * 
   * This alternative interface allows rendering text based on AWT Fonts which are
   * drawn on top of the GL Image.
   */
  /*
   * @Override public void glutBitmapString(Font font, String label, Coord3d
   * position, Color color) { opengl.glut_h.glutBitmapString(toAWT(font), label,
   * position.x, position.y, position.z, color.r, color.g, color.b, 0); }
   * 
   * @Override public void drawText(Font font, String label, Coord3d position,
   * Color color, float rotation) { opengl.glut_h.glutBitmapString(toAWT(font),
   * label, position.x, position.y, position.z, color.r, color.g, color.b,
   * rotation); }
   */

  @Override
  public void glutBitmapString(int font, String string) {
    logger.error("not available in generated code");
    //opengl.glut_h.glutBitmapString(font, alloc(string));

    // Use freeglut
    ///opt/X11/include/GL/freeglut.h
  }

  @Override
  public void drawText(Font font, String label, Coord3d position, Color color, float rotation) {
    glutBitmapString(font, label, position, color);
  }

  @Override
  public void glutBitmapString(Font axisFont, String label, Coord3d p, Color c) {
    color(c);
    raster(p, null);
    glutBitmapString(axisFont.getCode(), label);
  }

  private java.awt.Font toAWT(Font font) {
    return new java.awt.Font(font.getName(), java.awt.Font.PLAIN, font.getHeight());
  }

  // GL LISTS

  @Override
  public int glGenLists(int range) {
    return opengl.glut_h.glGenLists(range);
  }

  @Override
  public void glNewList(int list, int mode) {
    opengl.glut_h.glNewList(list, mode);
  }

  @Override
  public void glNewList(int list, ListMode mode) {
    switch (mode) {
    case COMPILE:
      glNewList(list, opengl.glut_h.GL_COMPILE());
    case COMPILE_AND_EXECUTE:
      glNewList(list, opengl.glut_h.GL_COMPILE_AND_EXECUTE());
    }
  }

  @Override
  public void glEndList() {
    opengl.glut_h.glEndList();
  }

  @Override
  public void glCallList(int list) {
    opengl.glut_h.glCallList(list);
  }

  @Override
  public boolean glIsList(int list) {
    logger.error("to be implemented");
    return false;//opengl.glut_h.glIsList(list);
  }

  @Override
  public void glDeleteLists(int list, int range) {
    opengl.glut_h.glDeleteLists(list, range);
  }

  // GLU

  @Override
  public void gluDisk(double inner, double outer, int slices, int loops) {
    logger.error("to be implemented");

    //GLUquadricObj qobj = opengl.glut_h.gluNewQuadric();
    //qobj.Normals = opengl.glut_h.GLU_NONE(); // https://github.com/jzy3d/jzy3d-api/issues/179
    //opengl.glut_h.gluDisk(qobj, inner, outer, slices, loops);
  }

  @Override
  public void glutSolidSphere(double radius, int slices, int stacks) {
    opengl.glut_h.glutSolidSphere(radius, slices, stacks);
  }

  @Override
  public void glutSolidTeapot(float scale) {
    opengl.glut_h.glutSolidTeapot(scale);
  }

  @Override
  public void glutWireTeapot(float scale) {
    opengl.glut_h.glutWireTeapot(scale);
  }

  @Override
  public void gluSphere(double radius, int slices, int stacks) {
    logger.error("to be implemented");
    //GLUquadricObj qobj = opengl.glut_h.gluNewQuadric();
    //opengl.glut_h.gluSphere(qobj, radius, slices, stacks);
  }

  @Override
  public void gluCylinder(double base, double top, double height, int slices, int stacks) {
    logger.error("to be implemented");

    // GLUquadricObj qobj = opengl.glut_h.gluNewQuadric();
    //opengl.glut_h.gluCylinder(qobj, base, top, height, slices, stacks);
  }

  @Override
  public void glutSolidCube(float size) {
    opengl.glut_h.glutSolidCube(size);

  }

  // GL FEEDBACK BUFER

  @Override
  public void glFeedbackBuffer(int size, int type, FloatBuffer buffer) {
    opengl.glut_h.glFeedbackBuffer(size, type, alloc(buffer.array()));
  }

  @Override
  public int glRenderMode(int mode) {
    return opengl.glut_h.glRenderMode(mode);
  }

  @Override
  public int glRenderMode(RenderMode mode) {
    switch (mode) {
    case RENDER:
      return glRenderMode(opengl.glut_h.GL_RENDER());
    case SELECT:
      return glRenderMode(opengl.glut_h.GL_SELECT());
    case FEEDBACK:
      return glRenderMode(opengl.glut_h.GL_FEEDBACK());
    }
    throw new IllegalArgumentException("Unsupported mode '" + mode + "'");
  }

  @Override
  public void glPassThrough(float token) {
    opengl.glut_h.glPassThrough(token);
  }

  // GL VIEWPOINT

  @Override
  public void glOrtho(double left, double right, double bottom, double top, double near_val, double far_val) {
    opengl.glut_h.glOrtho(left, right, bottom, top, near_val, far_val);
  }

  @Override
  public void gluPerspective(double fovy, double aspect, double zNear, double zFar) {
    opengl.glut_h.gluPerspective(fovy, aspect, zNear, zFar);
  }

  @Override
  public void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar) {
    opengl.glut_h.glFrustum(left, right, bottom, top, zNear, zFar);
  }

  @Override
  public void gluLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX,
      float upY, float upZ) {
    opengl.glut_h.gluLookAt(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
  }

  @Override
  public void glViewport(int x, int y, int width, int height) {
    opengl.glut_h.glViewport(x, y, width, height);
  }

  @Override
  public void glClipPlane(int plane, double[] equation) {
    switch (plane) {
    case 0:
      opengl.glut_h.glClipPlane(opengl.glut_h.GL_CLIP_PLANE0(), alloc(equation));
      break;
    case 1:
      opengl.glut_h.glClipPlane(opengl.glut_h.GL_CLIP_PLANE1(), alloc(equation));
      break;
    case 2:
      opengl.glut_h.glClipPlane(opengl.glut_h.GL_CLIP_PLANE2(), alloc(equation));
      break;
    case 3:
      opengl.glut_h.glClipPlane(opengl.glut_h.GL_CLIP_PLANE3(), alloc(equation));
      break;
    case 4:
      opengl.glut_h.glClipPlane(opengl.glut_h.GL_CLIP_PLANE4(), alloc(equation));
      break;
    case 5:
      opengl.glut_h.glClipPlane(opengl.glut_h.GL_CLIP_PLANE5(), alloc(equation));
      break;
    default:
      throw new IllegalArgumentException("Expect a plane ID in [0;5]");
    }
  }

  @Override
  public void glEnable_ClipPlane(int plane) {
    switch (plane) {
    case 0:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE0());
      break;
    case 1:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE1());
      break;
    case 2:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE2());
      break;
    case 3:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE3());
      break;
    case 4:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE4());
      break;
    case 5:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE5());
      break;
    default:
      throw new IllegalArgumentException("Expect a plane ID in [0;5]");
    }
  }

  @Override
  public void glDisable_ClipPlane(int plane) {
    switch (plane) {
    case 0:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE0());
      break;
    case 1:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE1());
      break;
    case 2:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE2());
      break;
    case 3:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE3());
      break;
    case 4:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE4());
      break;
    case 5:
      opengl.glut_h.glEnable(opengl.glut_h.GL_CLIP_PLANE5());
      break;
    default:
      throw new IllegalArgumentException("Expect a plane ID in [0;5]");
    }
  }

  @Override
  public boolean gluUnProject(float winX, float winY, float winZ, float[] model, int model_offset, float[] proj,
      int proj_offset, int[] view, int view_offset, float[] objPos, int objPos_offset) {
    // throw new NotImplementedException();

    double objX[] = new double[1];
    double objY[] = new double[1];
    double objZ[] = new double[1];

    int st = opengl.glut_h.gluUnProject((double)winX, (double)winY, (double)winZ, alloc(dbl(model)), alloc(dbl(proj)), alloc(view), alloc(objX), alloc(objY), alloc(objZ));

    objPos[0] = (float) objX[0];
    objPos[1] = (float) objY[0];
    objPos[2] = (float) objZ[0];

    return st==1;
  }

  protected double[] dbl(float[] values) {
    double[] dbl = new double[values.length];
    for (int i = 0; i < values.length; i++) {
      dbl[i] = values[i];
    }
    return dbl;
  }

  @Override
  public boolean gluProject(float objX, float objY, float objZ, float[] model, int model_offset, float[] proj,
      int proj_offset, int[] view, int view_offset, float[] winPos, int winPos_offset) {
    // throw new NotImplementedException();
    // opengl.glut_h.gluProject(objx, objy, objz, model, proj, viewport, winx, winy,
    // winz)

    double[] modelD = new double[model.length];
    for (int i = 0; i < model.length; i++) {
      modelD[i] = model[i];
    }

    // double[] winy = new double[1];
    // double[] winz = new double[1];

    double[] projD = new double[proj.length];
    for (int i = 0; i < proj.length; i++) {
      projD[i] = proj[i];
    }

    double[] winx = new double[1];
    double[] winy = new double[1];
    double[] winz = new double[1];

    int out = opengl.glut_h.gluProject(objX, objY, objZ, alloc(modelD), alloc(projD), alloc(view), alloc(winx), alloc(winy), alloc(winz));

    // winPos[0], winPos[1], winPos[2];
    winPos[0] = (float) winx[0];
    winPos[1] = (float) winy[0];
    winPos[2] = (float) winz[0];

    return out==1;
  }

  // GL GET

  @Override
  public void glGetIntegerv(int pname, int[] data, int data_offset) {
    opengl.glut_h.glGetIntegerv(pname, alloc(data));
  }

  @Override
  public void glGetDoublev(int pname, double[] params, int params_offset) {
    opengl.glut_h.glGetDoublev(pname, alloc(params));
  }

  @Override
  public void glGetFloatv(int pname, float[] data, int data_offset) {
    opengl.glut_h.glGetFloatv(pname, alloc(data));
  }

  @Override
  public void glDepthFunc(int func) {
    opengl.glut_h.glDepthFunc(func);
  }

  @Override
  public void glDepthRangef(float near, float far) {
    // printGLDepthRange();
    opengl.glut_h.glDepthRange(near, far);
  }

  public void printGLDepthRange() {
    float[] params = new float[2];
    opengl.glut_h.glGetFloatv(opengl.glut_h.GL_DEPTH_RANGE(), alloc(params));
    // Logger.getLogger(EmulGLPainter.class).info();
    Array.print(params);
  }

  @Override
  public void glBlendFunc(int sfactor, int dfactor) {
    opengl.glut_h.glBlendFunc(sfactor, dfactor);
  }

  @Override
  public void glHint(int target, int mode) {
    throw new NotImplementedException(
        "not in jopengl.glut_h. https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/glHint.xml");
    // opengl.glut_h.glHint(target, mode);

  }

  // GL LIGHTS

  @Override
  public void glShadeModel(ColorModel colorModel) {
    if (ColorModel.SMOOTH.equals(colorModel)) {
      opengl.glut_h.glShadeModel(opengl.glut_h.GL_SMOOTH());
    } else if (ColorModel.FLAT.equals(colorModel)) {
      opengl.glut_h.glShadeModel(opengl.glut_h.GL_FLAT());
    } else {
      throw new IllegalArgumentException("Unsupported setting : '" + colorModel + "'");
    }
  }

  @Override
  public void glShadeModel(int mode) {
    opengl.glut_h.glShadeModel(mode);
  }

  @Override
  public void glShadeModel_Smooth() {
    opengl.glut_h.glShadeModel(opengl.glut_h.GL_SMOOTH());
  }

  @Override
  public void glShadeModel_Flat() {
    opengl.glut_h.glShadeModel(opengl.glut_h.GL_FLAT());
  }

  @Override
  public void glMaterialfv(int face, int pname, float[] params, int params_offset) {
    opengl.glut_h.glMaterialfv(face, pname, alloc(params));
  }

  @Override
  public void glNormal3f(float nx, float ny, float nz) {
    opengl.glut_h.glNormal3f(nx, ny, nz);
  }

  @Override
  public void glLightf(int light, Attenuation.Type attenuationType, float value) {
    if (Attenuation.Type.CONSTANT.equals(attenuationType)) {
      glLightf(light, opengl.glut_h.GL_CONSTANT_ATTENUATION(), value);
    } else if (Attenuation.Type.LINEAR.equals(attenuationType)) {
      glLightf(light, opengl.glut_h.GL_LINEAR_ATTENUATION(), value);
    } else if (Attenuation.Type.QUADRATIC.equals(attenuationType)) {
      glLightf(light, opengl.glut_h.GL_QUADRATIC_ATTENUATION(), value);
    }
  }

  @Override
  public void glLightf(int light, int pname, float value) {
    opengl.glut_h.glLightf(lightId(light), pname, value);
  }

  @Override
  public void glLightfv(int light, int pname, float[] params, int params_offset) {
    opengl.glut_h.glLightfv(lightId(light), pname, alloc(params));
  }

  @Override
  public void glLight_Position(int lightId, float[] positionZero) {
    glLightfv(lightId, opengl.glut_h.GL_POSITION(), positionZero, 0);
  }

  @Override
  public void glLight_Ambiant(int lightId, Color ambiantColor) {
    glLightfv(lightId, opengl.glut_h.GL_AMBIENT(), ambiantColor.toArray(), 0);
  }

  @Override
  public void glLight_Diffuse(int lightId, Color diffuseColor) {
    glLightfv(lightId, opengl.glut_h.GL_DIFFUSE(), diffuseColor.toArray(), 0);
  }

  @Override
  public void glLight_Specular(int lightId, Color specularColor) {
    glLightfv(lightId, opengl.glut_h.GL_SPECULAR(), specularColor.toArray(), 0);
  }
  
  @Override
  public void glLight_Shininess(int lightId, float value) {
    glLightf(lightId, opengl.glut_h.GL_SHININESS(), value);    
  }

  @Override
  public void glEnable_Light(int light) {
    glEnable(lightId(light));
  }

  @Override
  public void glDisable_Light(int light) {
    glEnable(lightId(light));
  }

  protected int lightId(int id) {
    switch (id) {
    case 0:
      return opengl.glut_h.GL_LIGHT0();
    case 1:
      return opengl.glut_h.GL_LIGHT1();
    case (2):
      return opengl.glut_h.GL_LIGHT2();
    case 3:
      return opengl.glut_h.GL_LIGHT3();
    case 4:
      return opengl.glut_h.GL_LIGHT4();
    case 5:
      return opengl.glut_h.GL_LIGHT5();
    case 6:
      return opengl.glut_h.GL_LIGHT6();
    case 7:
      return opengl.glut_h.GL_LIGHT7();
    }
    throw new IllegalArgumentException("Unsupported light ID '" + id + "'");
  }

  @Override
  public void glLightModeli(int mode, int value) {
    opengl.glut_h.glLightModeli(mode, value);
  }

  @Override
  public void glLightModelfv(int mode, float[] value) {
    opengl.glut_h.glLightModelfv(mode, alloc(value));
  }

  @Override
  public void glLightModel(LightModel model, boolean value) {
    if (LightModel.LIGHT_MODEL_TWO_SIDE.equals(model)) {
      glLightModeli(opengl.glut_h.GL_LIGHT_MODEL_TWO_SIDE(), value ? 1 : 0);
    } else if (LightModel.LIGHT_MODEL_LOCAL_VIEWER.equals(model)) {
      glLightModeli(opengl.glut_h.GL_LIGHT_MODEL_LOCAL_VIEWER(), value ? 1 : 0);
    } else {
      throw new IllegalArgumentException("Unsupported model '" + model + "'");
    }
  }

  @Override
  public void glLightModel(LightModel model, Color color) {
    if (LightModel.LIGHT_MODEL_AMBIENT.equals(model)) {
      glLightModelfv(opengl.glut_h.GL_LIGHT_MODEL_AMBIENT(), color.toArray());
    } else {
      throw new IllegalArgumentException("Unsupported model '" + model + "'");
    }
  }

  // GL OTHER

  @Override
  public void glClearColor(float red, float green, float blue, float alpha) {
    opengl.glut_h.glClearColor(red, green, blue, alpha);
  }

  @Override
  public void glClearDepth(double d) {
    opengl.glut_h.glClearDepth(d);
  }

  @Override
  public void glClear(int mask) {
    opengl.glut_h.glClear(mask);
  }

  @Override
  public void glClearColorAndDepthBuffers() {
    glClear(opengl.glut_h.GL_COLOR_BUFFER_BIT() | opengl.glut_h.GL_DEPTH_BUFFER_BIT());
  }

  // GL PICKING

  @Override
  public void glInitNames() {
    opengl.glut_h.glInitNames();
  }

  @Override
  public void glLoadName(int name) {
    opengl.glut_h.glLoadName(name);
  }

  @Override
  public void glPushName(int name) {
    opengl.glut_h.glPushName(name);
  }

  @Override
  public void glPopName() {
    opengl.glut_h.glPopName();
  }

  @Override
  public void glSelectBuffer(int size, IntBuffer buffer) {
    opengl.glut_h.glSelectBuffer(size, allocator.allocateArray(C_INT, buffer.array()));
  }

  @Override
  public void gluPickMatrix(double x, double y, double delX, double delY, int[] viewport, int viewport_offset) {
    opengl.glut_h.gluPickMatrix(x, y, delX, delY, allocator.allocateArray(C_INT, viewport));
  }

  @Override
  public void glFlush() {
    opengl.glut_h.glFlush();
  }

  @Override
  public void glEvalCoord2f(float u, float v) {
    opengl.glut_h.glEvalCoord2f(u, v);
  }

  @Override
  public void glMap2f(int target, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride,
      int vorder, FloatBuffer points) {
    throw new NotImplementedException("NEED TO CONVERT FloatBuffer to float[][][]");
    // opengl.glut_h.glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride,
    // vorder, points);
    // (target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
  }

  /* ***************** SHORTCUTS TO GL CONSTANTS *************************** */

  /**
   * NOT SUPPORTED in jGL wich emulate OpenGL 1 only.
   * 
   * Note that {@lin NotImplementedException} are NOT triggered to ease
   * compatibility with geometries that have the polygon offset fill setting
   * enabled by default.
   * 
   * Was added to OpenGL 2
   * (https://www.khronos.org/registry/OpenGL-Refpages/gl4/html/glPolygonOffset.xhtml).
   * 
   * You may desactivate offset fill with
   * drawable.setPolygonOffsetFillEnable(false).
   * 
   * @see https://github.com/jzy3d/jGL/issues/3
   */
  @Override
  public void glEnable_PolygonOffsetFill() {
    // throw new NotImplementedException(OFFSET_FILL_NOT_IMPLEMENTED);
  }

  /**
   * @see {@link #glEnable_PolygonOffsetFill()}
   */
  @Override
  public void glDisable_PolygonOffsetFill() {
    // throw new NotImplementedException(OFFSET_FILL_NOT_IMPLEMENTED);
  }

  /**
   * @see {@link #glEnable_PolygonOffsetFill()}
   */
  @Override
  public void glEnable_PolygonOffsetLine() {
    // throw new NotImplementedException(OFFSET_FILL_NOT_IMPLEMENTED);
  }

  /**
   * @see {@link #glEnable_PolygonOffsetFill()}
   */
  @Override
  public void glDisable_PolygonOffsetLine() {
    // throw new NotImplementedException(OFFSET_FILL_NOT_IMPLEMENTED);
  }

  @Override
  public void glDisable_Lighting() {
    glDisable(opengl.glut_h.GL_LIGHTING());
  }

  @Override
  public void glEnable_Lighting() {
    glEnable(opengl.glut_h.GL_LIGHTING());
  }

  @Override
  public void glEnable_LineStipple() {
    glEnable(opengl.glut_h.GL_LINE_STIPPLE());
  }

  @Override
  public void glDisable_LineStipple() {
    glDisable(opengl.glut_h.GL_LINE_STIPPLE());
  }

  @Override
  public void glEnable_Blend() {
    glEnable(opengl.glut_h.GL_BLEND());
  }

  @Override
  public void glDisable_Blend() {
    glDisable(opengl.glut_h.GL_BLEND());
  }

  @Override
  public void glMatrixMode_ModelView() {
    glMatrixMode(opengl.glut_h.GL_MODELVIEW());
  }

  @Override
  public void glMatrixMode_Projection() {
    glMatrixMode(opengl.glut_h.GL_PROJECTION());
  }

  @Override
  public void glBegin_Polygon() {
    glBegin(opengl.glut_h.GL_POLYGON());
  }

  @Override
  public void glBegin_Quad() {
    glBegin(opengl.glut_h.GL_QUADS());
  }

  @Override
  public void glBegin_Triangle() {
    glBegin(opengl.glut_h.GL_TRIANGLES());
  }

  @Override
  public void glBegin_Point() {
    glBegin(opengl.glut_h.GL_POINTS());
  }

  @Override
  public void glBegin_LineStrip() {
    glBegin(opengl.glut_h.GL_LINE_STRIP());
  }

  @Override
  public void glBegin_LineLoop() {
    glBegin(opengl.glut_h.GL_LINE_LOOP());
  }

  @Override
  public void glBegin_Line() {
    glBegin(opengl.glut_h.GL_LINES());
  }

  @Override
  public void glEnable_CullFace() {
    glEnable(opengl.glut_h.GL_CULL_FACE());
  }

  @Override
  public void glDisable_CullFace() {
    glDisable(opengl.glut_h.GL_CULL_FACE());
  }

  @Override
  public void glFrontFace_ClockWise() {
    glFrontFace(opengl.glut_h.GL_CCW());
  }

  @Override
  public void glCullFace_Front() {
    glCullFace(opengl.glut_h.GL_FRONT());
  }

  @Override
  public void glEnable_ColorMaterial() {
    glEnable(opengl.glut_h.GL_COLOR_MATERIAL());
  }

  @Override
  public void glMaterial(MaterialProperty material, Color color, boolean isFront) {
    if (isFront) {
      glMaterialfv(opengl.glut_h.GL_FRONT(), materialProperty(material), color.toArray(), 0);
    } else {
      glMaterialfv(opengl.glut_h.GL_BACK(), materialProperty(material), color.toArray(), 0);
    }
  }

  @Override
  public void glMaterial(MaterialProperty material, float[] color, boolean isFront) {
    if (isFront) {
      glMaterialfv(opengl.glut_h.GL_FRONT(), materialProperty(material), color, 0);
    } else {
      glMaterialfv(opengl.glut_h.GL_BACK(), materialProperty(material), color, 0);
    }
  }

  protected int materialProperty(MaterialProperty material) {
    switch (material) {
    case AMBIENT:
      return opengl.glut_h.GL_AMBIENT();
    case DIFFUSE:
      return opengl.glut_h.GL_DIFFUSE();
    case SPECULAR:
      return opengl.glut_h.GL_SPECULAR();
    case SHININESS:
      return opengl.glut_h.GL_SHININESS();
    }
    throw new IllegalArgumentException("Unsupported property '" + material + "'");
  }

  @Override
  public void glEnable_PointSmooth() {
    glEnable(opengl.glut_h.GL_POINT_SMOOTH());
  }

  @Override
  public void glHint_PointSmooth_Nicest() {
    glHint(opengl.glut_h.GL_POINT_SMOOTH_HINT(), opengl.glut_h.GL_NICEST());
  }

  @Override
  public void glDepthFunc(DepthFunc func) {
    switch(func) {
      case GL_ALWAYS: opengl.glut_h.glDepthFunc(opengl.glut_h.GL_ALWAYS()); break;
      case GL_NEVER: opengl.glut_h.glDepthFunc(GL.GL_NEVER); break;
      case GL_EQUAL: opengl.glut_h.glDepthFunc(GL.GL_EQUAL); break;
      case GL_GEQUAL: opengl.glut_h.glDepthFunc(GL.GL_GEQUAL); break;
      case GL_GREATER: opengl.glut_h.glDepthFunc(GL.GL_GREATER); break;
      case GL_LEQUAL: opengl.glut_h.glDepthFunc(GL.GL_LEQUAL); break;
      case GL_LESS: opengl.glut_h.glDepthFunc(GL.GL_LESS); break;
      case GL_NOTEQUAL: opengl.glut_h.glDepthFunc(GL.GL_NOTEQUAL); break;
      default: throw new RuntimeException("Enum value not supported : " + func);
    }
  }

  @Override
  public void glEnable_DepthTest() {
    opengl.glut_h.glEnable(GL.GL_DEPTH_TEST);    
  }

  @Override
  public void glDisable_DepthTest() {
    opengl.glut_h.glDisable(GL.GL_DEPTH_TEST);    
  }

}
