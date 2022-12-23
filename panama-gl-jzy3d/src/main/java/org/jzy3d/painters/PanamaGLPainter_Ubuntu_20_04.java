package org.jzy3d.painters;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import org.jzy3d.chart.Chart;
import org.jzy3d.chart.controllers.mouse.camera.AWTCameraMouseController;
import org.jzy3d.colors.Color;
import org.jzy3d.maths.Array;
import org.jzy3d.maths.Coord2d;
import org.jzy3d.maths.Coord3d;
import org.jzy3d.maths.Rectangle;
import org.jzy3d.plot3d.pipelines.NotImplementedException;
import org.jzy3d.plot3d.primitives.PolygonFill;
import org.jzy3d.plot3d.primitives.PolygonMode;
import org.jzy3d.plot3d.rendering.canvas.EmulGLCanvas;
import org.jzy3d.plot3d.rendering.canvas.PanamaGLCanvas;
import org.jzy3d.plot3d.rendering.canvas.Quality;
import org.jzy3d.plot3d.rendering.lights.Attenuation;
import org.jzy3d.plot3d.rendering.lights.LightModel;
import org.jzy3d.plot3d.rendering.lights.MaterialProperty;
import org.jzy3d.plot3d.rendering.view.View;
import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.ubuntu.v20.glutDisplayFunc$callback;
import opengl.ubuntu.v20.glutIdleFunc$callback;
import opengl.ubuntu.v20.glutMotionFunc$callback;
import opengl.ubuntu.v20.glutMouseFunc$callback;
import opengl.ubuntu.v20.glutReshapeFunc$callback;
import opengl.ubuntu.v20.glut_h;

public class PanamaGLPainter_Ubuntu_20_04 extends AbstractPainter implements PanamaGLPainter{
  static Logger logger = Logger.getLogger(PanamaGLPainter_Ubuntu_20_04.class);

  ResourceScope scope;
  SegmentAllocator allocator;

  public PanamaGLPainter_Ubuntu_20_04() {
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

  public String glGetString(int stringID){
    return CLinker.toJavaString(glut_h.glGetString(stringID));
  }

  /////////////////////////////////////////////

  @Override
  public void glutStart(Chart chart, Rectangle bounds, String title, String message) {
    var painter = (PanamaGLPainter) chart.getPainter();
    var canvas = (PanamaGLCanvas) chart.getCanvas();
    var renderer = canvas.getRenderer();
    var scope = painter.getScope();
    var allocator = painter.getAllocator();
    var argc = allocator.allocate(C_INT, 0);

    // GLUT Init window
    glut_h.glutInit(argc, argc);
    glut_h.glutInitDisplayMode(glut_h.GLUT_DOUBLE() | glut_h.GLUT_RGB() | glut_h.GLUT_DEPTH());
    glut_h.glutInitWindowSize(bounds.width, bounds.height);
    glut_h.glutCreateWindow(CLinker.toCString(title + "/" + message, scope));

    // GLUT Display/Idle callback
    glut_h.glutDisplayFunc(glutDisplayFunc$callback.allocate(renderer::display, scope));
    glut_h.glutReshapeFunc(glutReshapeFunc$callback.allocate(renderer::reshape, scope));
    glut_h.glutIdleFunc(glutIdleFunc$callback.allocate(renderer::onIdle, scope));

    // GLUT Mouse callbacks
    AWTCameraMouseController mouse = (AWTCameraMouseController) chart.getMouse();

    // GLUT Mouse click listener
    glutMouseFunc$callback mouseClickCallback = new glutMouseFunc$callback(){
      long time;
      long timePrev;
      @Override
      public void apply(int button, int state, int x, int y) {
        int clickCount = 1;
        time = System.currentTimeMillis();
        if(timePrev>0){
          long elapsed = time-timePrev;
          if(elapsed<200){
            clickCount++;
          }
        }
        if(state==0)
          mouse.mousePressed(mouseEvent(x, y, InputEvent.BUTTON1_DOWN_MASK, clickCount));
        else if(state==1)
          mouse.mouseReleased(mouseEvent(x, y, InputEvent.BUTTON1_DOWN_MASK, clickCount));

        timePrev = time;
        //System.out.println("mouse x:"+x+" y:"+y + " button:" + button + " state:" + state);
      }
    };
    glut_h.glutMouseFunc(glutMouseFunc$callback.allocate(mouseClickCallback, scope));

    // Motion is invoked if a mouse button is pressed, otherwise not
    // https://www.opengl.org/resources/libraries/glut/spec3/node51.html
    glutMotionFunc$callback mouseMotionCallback = new glutMotionFunc$callback(){
      @Override
      public void apply(int x, int y) {
        mouse.mouseDragged(mouseEvent(x, y, InputEvent.BUTTON1_DOWN_MASK));
        //System.out.println("mouse motion.x:"+x+" y:"+y);
      }
    };
    glut_h.glutMotionFunc(glutMotionFunc$callback.allocate(mouseMotionCallback, scope));


    // -----------------------------------------------------
    // Version - GLUT need to be initialized

    System.out.println(version(painter));

    // -----------------------------------------------------
    // Warn : this will block execution

    glut_h.glutMainLoop();

    // glut is OS specific
  }

  @Override
  public void glutSwapBuffers(){
    glut_h.glutSwapBuffers();
  }

  @Override
  public void glutPostRedisplay(){
    glut_h.glutPostRedisplay();
  }

  @Override
  public int glutGetWindowWidth(){
    return glut_h.glutGet(glut_h.GLUT_WINDOW_WIDTH());
  }
  
  @Override
  public int glutGetWindowHeight(){
    return glut_h.glutGet(glut_h.GLUT_WINDOW_HEIGHT());
  }

  protected static MouseEvent mouseEvent(int x, int y, int modifiers) {
    return mouseEvent(x,y,modifiers,1);
  }

  protected static MouseEvent mouseEvent(int x, int y, int modifiers, int clickCount) {
    return new MouseEvent(dummy, 0, 0, modifiers, x, y, 100, 100, clickCount, false, 0);
  }
  static Component dummy = new JPanel();

  protected StringBuffer version(PanamaGLPainter painter){
    StringBuffer sb = new StringBuffer();
    sb.append("GL_VENDOR     : " + painter.glGetString(glut_h.GL_VENDOR()) + "\n");
    sb.append("GL_RENDERER   : " + painter.glGetString(glut_h.GL_RENDERER()) + "\n");
    sb.append("GL_VERSION    : " + painter.glGetString(glut_h.GL_VERSION()) + "\n");

    String ext = painter.glGetString(glut_h.GL_EXTENSIONS());

    if(ext!=null) {
      sb.append("GL_EXTENSIONS : " + "\n");
      for(String e: ext.split(" ")) {
        sb.append("\t" + e + "\n");
      }
    }
    else {
      sb.append("GL_EXTENSIONS : null\n");
    }

    return sb;
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
      glut_h.glEnable(glut_h.GL_DEPTH_TEST());
      glut_h.glDepthFunc(glut_h.GL_LESS());
    } else {
      glut_h.glDisable(glut_h.GL_DEPTH_TEST());
    }

    // Blending : more beautifull with jGL without this
    glut_h.glBlendFunc(glut_h.GL_SRC_ALPHA(), glut_h.GL_ONE_MINUS_SRC_ALPHA());

    // GL_SRC_ALPHA_SATURATE
    // on/off is handled by each viewport (camera or image)

    // Activate tranparency
    if (quality.isAlphaActivated()) {
      glut_h.glEnable(glut_h.GL_BLEND());
      glut_h.glEnable(glut_h.GL_ALPHA_TEST());

      if (quality.isDisableDepthBufferWhenAlpha()) {
        // Disable depth test to keeping pixels of
        // "what's behind a polygon" when drawing with
        // alpha
        glut_h.glDisable(glut_h.GL_DEPTH_TEST());
      }
    } else {
      glut_h.glDisable(glut_h.GL_ALPHA_TEST());
    }

    // Make smooth colors for polygons (interpolate color between points)
    glShadeModel(quality.getColorModel());

    // Make smoothing setting
    if (quality.isSmoothPolygon()) {
      glut_h.glEnable(glut_h.GL_POLYGON_SMOOTH());
    } else
      glut_h.glDisable(glut_h.GL_POLYGON_SMOOTH());

    if (quality.isSmoothLine()) {
      glut_h.glEnable(glut_h.GL_LINE_SMOOTH());
    } else
      glut_h.glDisable(glut_h.GL_LINE_SMOOTH());

    if (quality.isSmoothPoint()) {
      glut_h.glEnable(glut_h.GL_POINT_SMOOTH());
    } else
      glut_h.glDisable(glut_h.GL_POINT_SMOOTH());
    
  }

  @Override
  public int[] getViewPortAsInt() {
    int viewport[] = new int[4];
    glGetIntegerv(glut_h.GL_VIEWPORT(), viewport, 0);
    return viewport;
  }

  @Override
  public double[] getProjectionAsDouble() {
    double projection[] = new double[16];
    glGetDoublev(glut_h.GL_PROJECTION_MATRIX(), projection, 0);
    return projection;
  }

  @Override
  public float[] getProjectionAsFloat() {
    float projection[] = new float[16];
    glGetFloatv(glut_h.GL_PROJECTION_MATRIX(), projection, 0);
    return projection;
  }

  @Override
  public double[] getModelViewAsDouble() {
    double modelview[] = new double[16];
    glGetDoublev(glut_h.GL_MODELVIEW_MATRIX(), modelview, 0);
    return modelview;
  }

  @Override
  public float[] getModelViewAsFloat() {
    float modelview[] = new float[16];
    glGetFloatv(glut_h.GL_MODELVIEW_MATRIX(), modelview, 0);
    return modelview;
  }

  /************ OPEN GL Interface **************/

  // GL MATRIX

  @Override
  public void glPushMatrix() {
    glut_h.glPushMatrix();
  }

  @Override
  public void glPopMatrix() {
    glut_h.glPopMatrix();
  }

  @Override
  public void glMatrixMode(int mode) {
    glut_h.glMatrixMode(mode);
  }

  @Override
  public void glLoadIdentity() {
    glut_h.glLoadIdentity();
  }

  @Override
  public void glScalef(float x, float y, float z) {
    glut_h.glScalef(x, y, z);
  }

  @Override
  public void glTranslatef(float x, float y, float z) {
    glut_h.glTranslatef(x, y, z);
  }

  @Override
  public void glRotatef(float angle, float x, float y, float z) {
    glut_h.glRotatef(angle, x, y, z);
  }

  @Override
  public void glEnable(int type) {
    glut_h.glEnable(type);
  }

  @Override
  public void glDisable(int type) {
    glut_h.glDisable(type);
  }

  // GL GEOMETRY

  @Override
  public void glPointSize(float width) {
    glut_h.glPointSize(width);
  }

  @Override
  public void glLineWidth(float width) {
    glut_h.glLineWidth(width);
  }

  @Override
  public void glBegin(int type) {
    glut_h.glBegin(type);
  }

  @Override
  public void glColor3f(float r, float g, float b) {
    glut_h.glColor3f(r, b, b);
  }

  @Override
  public void glColor4f(float r, float g, float b, float a) {
    glut_h.glColor4f(r, g, b, a);
  }

  @Override
  public void glVertex3f(float x, float y, float z) {
    glut_h.glVertex3f(x, y, z);
  }

  @Override
  public void glVertex3d(double x, double y, double z) {
    glut_h.glVertex3d(x, y, z);
  }

  @Override
  public void glEnd() {
    glut_h.glEnd();
  }

  @Override
  public void glFrontFace(int mode) {
    glut_h.glFrontFace(mode);
  }

  @Override
  public void glCullFace(int mode) {
    glut_h.glCullFace(mode);
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
      return glut_h.GL_FRONT();
    case BACK:
      return glut_h.GL_BACK();
    case FRONT_AND_BACK:
      return glut_h.GL_FRONT_AND_BACK();
    default:
      throw new IllegalArgumentException("Unsupported mode '" + mode + "'");
    }
  }

  protected int polygonFillValue(PolygonFill mode) {
    switch (mode) {
    case FILL:
      return glut_h.GL_FILL();
    case LINE:
      return glut_h.GL_LINE();
    default:
      throw new IllegalArgumentException("Unsupported mode '" + mode + "'");
    }
  }

  @Override
  public void glPolygonMode(int frontOrBack, int fill) {
    glut_h.glPolygonMode(frontOrBack, fill);
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
    glut_h.glLineStipple(factor, pattern);
  }

  // GL TEXTURE

  @Override
  public void glTexCoord2f(float s, float t) {
    glut_h.glTexCoord2f(s, t);
  }

  @Override
  public void glTexEnvf(int target, int pname, float param) {
    glut_h.glTexEnvf(target, pname, param);
  }

  @Override
  public void glTexEnvi(int target, int pname, int param) {
    glut_h.glTexEnvi(target, pname, param);
  }

  @Override
  public void glRasterPos3f(float x, float y, float z) {
    /*if (!(z == 0 || Float.isNaN(z)))
      throw new NotImplementedException("z:" + z);
    else*/
      glut_h.glRasterPos3f(x, y, z);
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

  @Override
  public void glPixelZoom(float xfactor, float yfactor) {
    if (xfactor != 1 || yfactor != 1)
      throw new NotImplementedException("x:" + xfactor + "y:" + yfactor);
    // opengl.glut_h.glPixelZoom(xfactor, yfactor);
  }

  @Override
  public void glPixelStorei(int pname, int param) {
    glut_h.glPixelStorei(pname, param);
  }

  @Override
  public void glPixelStore(PixelStore store, int param) {
    switch (store) {
    case PACK_ALIGNMENT:
      glut_h.glPixelStorei(glut_h.GL_PACK_ALIGNMENT(), param);
      break;
    case UNPACK_ALIGNMENT:
      glut_h.glPixelStorei(glut_h.GL_UNPACK_ALIGNMENT(), param);
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
   * retrieving the graphic context of the canvas.
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
    //logger.error("not available in generated code");
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
    return glut_h.glGenLists(range);
  }

  @Override
  public void glNewList(int list, int mode) {
    glut_h.glNewList(list, mode);
  }

  @Override
  public void glNewList(int list, ListMode mode) {
    switch (mode) {
    case COMPILE:
      glNewList(list, glut_h.GL_COMPILE());
    case COMPILE_AND_EXECUTE:
      glNewList(list, glut_h.GL_COMPILE_AND_EXECUTE());
    }
  }

  @Override
  public void glEndList() {
    glut_h.glEndList();
  }

  @Override
  public void glCallList(int list) {
    glut_h.glCallList(list);
  }

  @Override
  public boolean glIsList(int list) {
    logger.error("to be implemented");
    return false;//opengl.glut_h.glIsList(list);
  }

  @Override
  public void glDeleteLists(int list, int range) {
    glut_h.glDeleteLists(list, range);
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
    glut_h.glutSolidSphere(radius, slices, stacks);
  }

  @Override
  public void glutSolidTeapot(float scale) {
    glut_h.glutSolidTeapot(scale);
  }

  @Override
  public void glutWireTeapot(float scale) {
    glut_h.glutWireTeapot(scale);
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
    glut_h.glutSolidCube(size);

  }

  // GL FEEDBACK BUFER

  @Override
  public void glFeedbackBuffer(int size, int type, FloatBuffer buffer) {
    glut_h.glFeedbackBuffer(size, type, alloc(buffer.array()));
  }

  @Override
  public int glRenderMode(int mode) {
    return glut_h.glRenderMode(mode);
  }

  @Override
  public int glRenderMode(RenderMode mode) {
    switch (mode) {
    case RENDER:
      return glRenderMode(glut_h.GL_RENDER());
    case SELECT:
      return glRenderMode(glut_h.GL_SELECT());
    case FEEDBACK:
      return glRenderMode(glut_h.GL_FEEDBACK());
    }
    throw new IllegalArgumentException("Unsupported mode '" + mode + "'");
  }

  @Override
  public void glPassThrough(float token) {
    glut_h.glPassThrough(token);
  }


// GL STENCIL BUFFER

  @Override
  public void glStencilFunc(StencilFunc func, int ref, int mask) {
    switch (func) {
      case GL_ALWAYS:
        glut_h.glStencilFunc(glut_h.GL_ALWAYS(), ref, mask);
        break;
      case GL_EQUAL:
        glut_h.glStencilFunc(glut_h.GL_EQUAL(), ref, mask);
        break;
      case GL_GREATER:
        glut_h.glStencilFunc(glut_h.GL_GREATER(), ref, mask);
        break;
      case GL_GEQUAL:
        glut_h.glStencilFunc(glut_h.GL_GEQUAL(), ref, mask);
        break;
      case GL_LEQUAL:
        glut_h.glStencilFunc(glut_h.GL_LEQUAL(), ref, mask);
        break;
      case GL_LESS:
        glut_h.glStencilFunc(glut_h.GL_LESS(), ref, mask);
        break;
      case GL_NEVER:
        glut_h.glStencilFunc(glut_h.GL_NEVER(), ref, mask);
        break;
      case GL_NOTEQUAL:
        glut_h.glStencilFunc(glut_h.GL_NOTEQUAL(), ref, mask);
        break;

      default:
        throw new IllegalArgumentException("Unknown enum value for StencilFunc: " + func);
    }
  }

  @Override
  public void glStencilMask(int mask) {
    glut_h.glStencilMask(mask);
  }

  @Override
  public void glStencilMask_True() {
    glut_h.glStencilMask(glut_h.GL_TRUE());
  }

  @Override
  public void glStencilMask_False(){
    glut_h.glStencilMask(glut_h.GL_FALSE());
  }


  @Override
  public void glStencilOp(StencilOp fail, StencilOp zfail, StencilOp zpass) {
    glut_h.glStencilOp(toInt(fail), toInt(zfail), toInt(zpass));
  }

  @Override
  public void glClearStencil(int s) {
    glut_h.glClearStencil(s);
  }

  protected int toInt(StencilOp fail) {
    switch (fail) {
      case GL_DECR:
        return glut_h.GL_DECR();
      case GL_INCR:
        return glut_h.GL_INCR();
      case GL_INVERT:
        return glut_h.GL_INVERT();
      case GL_KEEP:
        return glut_h.GL_KEEP();
      case GL_REPLACE:
        return glut_h.GL_REPLACE();
      case GL_ZERO:
        return glut_h.GL_ZERO();
      default:
        throw new IllegalArgumentException("Unknown enum value for StencilOp: " + fail);
    }
  }

  // GL VIEWPOINT

  @Override
  public View getView() {
    return super.getView();
  }

  @Override
  public void glOrtho(double left, double right, double bottom, double top, double near_val, double far_val) {
    glut_h.glOrtho(left, right, bottom, top, near_val, far_val);
  }
  
  @Override
  public void gluOrtho2D(double left, double right, double bottom, double top) {
    glut_h.gluOrtho2D(left, right, bottom, top);
  }

  @Override
  public void gluPerspective(double fovy, double aspect, double zNear, double zFar) {
    glut_h.gluPerspective(fovy, aspect, zNear, zFar);
  }

  @Override
  public void glFrustum(double left, double right, double bottom, double top, double zNear, double zFar) {
    glut_h.glFrustum(left, right, bottom, top, zNear, zFar);
  }

  @Override
  public void gluLookAt(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX,
      float upY, float upZ) {
    glut_h.gluLookAt(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
  }

  @Override
  public void glViewport(int x, int y, int width, int height) {
    glut_h.glViewport(x, y, width, height);
  }

  @Override
  public void glClipPlane(int plane, double[] equation) {
    glut_h.glClipPlane(clipPlaneId(plane), alloc(equation));
  }

  @Override
  public void glEnable_ClipPlane(int plane) {
    glut_h.glEnable(clipPlaneId(plane));
  }

  @Override
  public void glDisable_ClipPlane(int plane) {
    glut_h.glDisable(clipPlaneId(plane));
  }

  /** Return the GL clip plane ID according to an ID in [0;5]*/
  @Override
  public int clipPlaneId(int id) {
    switch (id) {
      case 0:
        return glut_h.GL_CLIP_PLANE0();
      case 1:
        return glut_h.GL_CLIP_PLANE1();
      case 2:
        return glut_h.GL_CLIP_PLANE2();
      case 3:
        return glut_h.GL_CLIP_PLANE3();
      case 4:
        return glut_h.GL_CLIP_PLANE4();
      case 5:
        return glut_h.GL_CLIP_PLANE5();
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

    int st = glut_h.gluUnProject((double)winX, (double)winY, (double)winZ, alloc(dbl(model)), alloc(dbl(proj)), alloc(view), alloc(objX), alloc(objY), alloc(objZ));

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

    int out = glut_h.gluProject(objX, objY, objZ, alloc(modelD), alloc(projD), alloc(view), alloc(winx), alloc(winy), alloc(winz));

    // winPos[0], winPos[1], winPos[2];
    winPos[0] = (float) winx[0];
    winPos[1] = (float) winy[0];
    winPos[2] = (float) winz[0];

    return out==1;
  }

  // GL GET

  @Override
  public void glGetIntegerv(int pname, int[] data, int data_offset) {
    glut_h.glGetIntegerv(pname, alloc(data));
  }

  @Override
  public void glGetDoublev(int pname, double[] params, int params_offset) {
    glut_h.glGetDoublev(pname, alloc(params));
  }

  @Override
  public void glGetFloatv(int pname, float[] data, int data_offset) {
    glut_h.glGetFloatv(pname, alloc(data));
  }

  @Override
  public void glDepthFunc(int func) {
    glut_h.glDepthFunc(func);
  }

  @Override
  public void glDepthRangef(float near, float far) {
    // printGLDepthRange();
    glut_h.glDepthRange(near, far);
  }

  public void printGLDepthRange() {
    float[] params = new float[2];
    glut_h.glGetFloatv(glut_h.GL_DEPTH_RANGE(), alloc(params));
    // Logger.getLogger(EmulGLPainter.class).info();
    Array.print(params);
  }

  @Override
  public void glBlendFunc(int sfactor, int dfactor) {
    glut_h.glBlendFunc(sfactor, dfactor);
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
      glut_h.glShadeModel(glut_h.GL_SMOOTH());
    } else if (ColorModel.FLAT.equals(colorModel)) {
      glut_h.glShadeModel(glut_h.GL_FLAT());
    } else {
      throw new IllegalArgumentException("Unsupported setting : '" + colorModel + "'");
    }
  }

  @Override
  public void glShadeModel(int mode) {
    glut_h.glShadeModel(mode);
  }

  @Override
  public void glShadeModel_Smooth() {
    glut_h.glShadeModel(glut_h.GL_SMOOTH());
  }

  @Override
  public void glShadeModel_Flat() {
    glut_h.glShadeModel(glut_h.GL_FLAT());
  }

  @Override
  public void glMaterialfv(int face, int pname, float[] params, int params_offset) {
    glut_h.glMaterialfv(face, pname, alloc(params));
  }

  @Override
  public void glNormal3f(float nx, float ny, float nz) {
    glut_h.glNormal3f(nx, ny, nz);
  }

  @Override
  public void glLightf(int light, Attenuation.Type attenuationType, float value) {
    if (Attenuation.Type.CONSTANT.equals(attenuationType)) {
      glLightf(light, glut_h.GL_CONSTANT_ATTENUATION(), value);
    } else if (Attenuation.Type.LINEAR.equals(attenuationType)) {
      glLightf(light, glut_h.GL_LINEAR_ATTENUATION(), value);
    } else if (Attenuation.Type.QUADRATIC.equals(attenuationType)) {
      glLightf(light, glut_h.GL_QUADRATIC_ATTENUATION(), value);
    }
  }

  @Override
  public void glLightf(int light, int pname, float value) {
    glut_h.glLightf(lightId(light), pname, value);
  }

  @Override
  public void glLightfv(int light, int pname, float[] params, int params_offset) {
    glut_h.glLightfv(lightId(light), pname, alloc(params));
  }

  @Override
  public void glLight_Position(int lightId, float[] positionZero) {
    glLightfv(lightId, glut_h.GL_POSITION(), positionZero, 0);
  }

  @Override
  public void glLight_Ambiant(int lightId, Color ambiantColor) {
    glLightfv(lightId, glut_h.GL_AMBIENT(), ambiantColor.toArray(), 0);
  }

  @Override
  public void glLight_Diffuse(int lightId, Color diffuseColor) {
    glLightfv(lightId, glut_h.GL_DIFFUSE(), diffuseColor.toArray(), 0);
  }

  @Override
  public void glLight_Specular(int lightId, Color specularColor) {
    glLightfv(lightId, glut_h.GL_SPECULAR(), specularColor.toArray(), 0);
  }
  
  @Override
  public void glLight_Shininess(int lightId, float value) {
    glLightf(lightId, glut_h.GL_SHININESS(), value);
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
      return glut_h.GL_LIGHT0();
    case 1:
      return glut_h.GL_LIGHT1();
    case (2):
      return glut_h.GL_LIGHT2();
    case 3:
      return glut_h.GL_LIGHT3();
    case 4:
      return glut_h.GL_LIGHT4();
    case 5:
      return glut_h.GL_LIGHT5();
    case 6:
      return glut_h.GL_LIGHT6();
    case 7:
      return glut_h.GL_LIGHT7();
    }
    throw new IllegalArgumentException("Unsupported light ID '" + id + "'");
  }

  @Override
  public void glLightModeli(int mode, int value) {
    glut_h.glLightModeli(mode, value);
  }

  @Override
  public void glLightModelfv(int mode, float[] value) {
    glut_h.glLightModelfv(mode, alloc(value));
  }

  @Override
  public void glLightModel(LightModel model, boolean value) {
    if (LightModel.LIGHT_MODEL_TWO_SIDE.equals(model)) {
      glLightModeli(glut_h.GL_LIGHT_MODEL_TWO_SIDE(), value ? 1 : 0);
    } else if (LightModel.LIGHT_MODEL_LOCAL_VIEWER.equals(model)) {
      glLightModeli(glut_h.GL_LIGHT_MODEL_LOCAL_VIEWER(), value ? 1 : 0);
    } else {
      throw new IllegalArgumentException("Unsupported model '" + model + "'");
    }
  }

  @Override
  public void glLightModel(LightModel model, Color color) {
    if (LightModel.LIGHT_MODEL_AMBIENT.equals(model)) {
      glLightModelfv(glut_h.GL_LIGHT_MODEL_AMBIENT(), color.toArray());
    } else {
      throw new IllegalArgumentException("Unsupported model '" + model + "'");
    }
  }

  // GL OTHER

  @Override
  public void glClearColor(float red, float green, float blue, float alpha) {
    glut_h.glClearColor(red, green, blue, alpha);
  }

  @Override
  public void glClearDepth(double d) {
    glut_h.glClearDepth(d);
  }

  @Override
  public void glClear(int mask) {
    glut_h.glClear(mask);
  }

  @Override
  public void glClearColorAndDepthBuffers() {
    glClear(glut_h.GL_COLOR_BUFFER_BIT() | glut_h.GL_DEPTH_BUFFER_BIT());
  }

  // GL PICKING

  @Override
  public void glInitNames() {
    glut_h.glInitNames();
  }

  @Override
  public void glLoadName(int name) {
    glut_h.glLoadName(name);
  }

  @Override
  public void glPushName(int name) {
    glut_h.glPushName(name);
  }

  @Override
  public void glPopName() {
    glut_h.glPopName();
  }

  @Override
  public void glSelectBuffer(int size, IntBuffer buffer) {
    glut_h.glSelectBuffer(size, allocator.allocateArray(C_INT, buffer.array()));
  }

  @Override
  public void gluPickMatrix(double x, double y, double delX, double delY, int[] viewport, int viewport_offset) {
    glut_h.gluPickMatrix(x, y, delX, delY, allocator.allocateArray(C_INT, viewport));
  }

  @Override
  public void glFlush() {
    glut_h.glFlush();
  }

  @Override
  public void glEvalCoord2f(float u, float v) {
    glut_h.glEvalCoord2f(u, v);
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

  @Override
  public void glEnable_PolygonOffsetFill() {
    glEnable(glut_h.GL_POLYGON_OFFSET_FILL());
  }

  @Override
  public void glDisable_PolygonOffsetFill() {
    glDisable(glut_h.GL_POLYGON_OFFSET_FILL());
  }

  @Override
  public void glEnable_PolygonOffsetLine() {
    glEnable(glut_h.GL_POLYGON_OFFSET_LINE());
  }

  @Override
  public void glDisable_PolygonOffsetLine() {
    glDisable(glut_h.GL_POLYGON_OFFSET_LINE());
  }

  @Override
  public void glDisable_Lighting() {
    glDisable(glut_h.GL_LIGHTING());
  }

  @Override
  public void glEnable_Lighting() {
    glEnable(glut_h.GL_LIGHTING());
  }

  @Override
  public void glEnable_LineStipple() {
    glEnable(glut_h.GL_LINE_STIPPLE());
  }

  @Override
  public void glDisable_LineStipple() {
    glDisable(glut_h.GL_LINE_STIPPLE());
  }

  @Override
  public void glEnable_Blend() {
    glEnable(glut_h.GL_BLEND());
  }

  @Override
  public void glDisable_Blend() {
    glDisable(glut_h.GL_BLEND());
  }

  @Override
  public void glMatrixMode_ModelView() {
    glMatrixMode(glut_h.GL_MODELVIEW());
  }

  @Override
  public void glMatrixMode_Projection() {
    glMatrixMode(glut_h.GL_PROJECTION());
  }

  @Override
  public void glBegin_Polygon() {
    glBegin(glut_h.GL_POLYGON());
  }

  @Override
  public void glBegin_Quad() {
    glBegin(glut_h.GL_QUADS());
  }

  @Override
  public void glBegin_Triangle() {
    glBegin(glut_h.GL_TRIANGLES());
  }

  @Override
  public void glBegin_Point() {
    glBegin(glut_h.GL_POINTS());
  }

  @Override
  public void glBegin_LineStrip() {
    glBegin(glut_h.GL_LINE_STRIP());
  }

  @Override
  public void glBegin_LineLoop() {
    glBegin(glut_h.GL_LINE_LOOP());
  }

  @Override
  public void glBegin_Line() {
    glBegin(glut_h.GL_LINES());
  }

  @Override
  public void glEnable_CullFace() {
    glEnable(glut_h.GL_CULL_FACE());
  }

  @Override
  public void glDisable_CullFace() {
    glDisable(glut_h.GL_CULL_FACE());
  }

  @Override
  public void glFrontFace_ClockWise() {
    glFrontFace(glut_h.GL_CCW());
  }

  @Override
  public void glCullFace_Front() {
    glCullFace(glut_h.GL_FRONT());
  }

  @Override
  public void glEnable_ColorMaterial() {
    glEnable(glut_h.GL_COLOR_MATERIAL());
  }

  @Override
  public void glMaterial(MaterialProperty material, Color color, boolean isFront) {
    if (isFront) {
      glMaterialfv(glut_h.GL_FRONT(), materialProperty(material), color.toArray(), 0);
    } else {
      glMaterialfv(glut_h.GL_BACK(), materialProperty(material), color.toArray(), 0);
    }
  }

  @Override
  public void glMaterial(MaterialProperty material, float[] color, boolean isFront) {
    if (isFront) {
      glMaterialfv(glut_h.GL_FRONT(), materialProperty(material), color, 0);
    } else {
      glMaterialfv(glut_h.GL_BACK(), materialProperty(material), color, 0);
    }
  }

  protected int materialProperty(MaterialProperty material) {
    switch (material) {
    case AMBIENT:
      return glut_h.GL_AMBIENT();
    case DIFFUSE:
      return glut_h.GL_DIFFUSE();
    case SPECULAR:
      return glut_h.GL_SPECULAR();
    case SHININESS:
      return glut_h.GL_SHININESS();
    }
    throw new IllegalArgumentException("Unsupported property '" + material + "'");
  }

  @Override
  public void glEnable_PointSmooth() {
    glEnable(glut_h.GL_POINT_SMOOTH());
  }

  @Override
  public void glHint_PointSmooth_Nicest() {
    glHint(glut_h.GL_POINT_SMOOTH_HINT(), glut_h.GL_NICEST());
  }

  @Override
  public void glDepthFunc(DepthFunc func) {
    switch(func) {
      case GL_ALWAYS: glut_h.glDepthFunc(glut_h.GL_ALWAYS()); break;
      case GL_NEVER: glut_h.glDepthFunc(glut_h.GL_NEVER()); break;
      case GL_EQUAL: glut_h.glDepthFunc(glut_h.GL_EQUAL()); break;
      case GL_GEQUAL: glut_h.glDepthFunc(glut_h.GL_GEQUAL()); break;
      case GL_GREATER: glut_h.glDepthFunc(glut_h.GL_GREATER()); break;
      case GL_LEQUAL: glut_h.glDepthFunc(glut_h.GL_LEQUAL()); break;
      case GL_LESS: glut_h.glDepthFunc(glut_h.GL_LESS()); break;
      case GL_NOTEQUAL: glut_h.glDepthFunc(glut_h.GL_NOTEQUAL()); break;
      default: throw new RuntimeException("Enum value not supported : " + func);
    }
  }

  @Override
  public void glEnable_DepthTest() {
    glut_h.glEnable(glut_h.GL_DEPTH_TEST());
  }

  @Override
  public void glDisable_DepthTest() {
    glut_h.glDisable(glut_h.GL_DEPTH_TEST());
  }

  @Override
  public void glEnable_Stencil() {
    glut_h.glEnable(glut_h.GL_STENCIL());
  }

  @Override
  public void glDisable_Stencil() {
    glut_h.glDisable(glut_h.GL_STENCIL());
  }
}
