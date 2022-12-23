package org.jzy3d.painters;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.macos.v10_15_3.glut_h;
import org.jzy3d.chart.Chart;
import org.jzy3d.maths.Rectangle;

import static jdk.incubator.foreign.CLinker.*;

public interface PanamaGLPainter {
    public ResourceScope getScope();

    public SegmentAllocator getAllocator();

    public MemorySegment alloc(double[] value);

    public MemorySegment alloc(float[] value);

    public MemorySegment alloc(int[] value);

    public MemorySegment alloc(String value);

    public String glGetString(int stringID);

    /**
     * This temporary helper allows starting a GLUT window like an AWT Frame would start
     * for a Jzy3D chart.
     *
     * IT IS NOT the name of an existing GLUT function.
     *
     * @param chart
     * @param bounds
     * @param title
     * @param message
     */
    public void glutStart(Chart chart, Rectangle bounds, String title, String message);


    public void glutSwapBuffers();

    public void glutPostRedisplay();

    public int glutGetWindowWidth();
    public int glutGetWindowHeight();

}
