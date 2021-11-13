package org.jzy3d.painters;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import opengl.macos.v10_15_3.glut_h;

import static jdk.incubator.foreign.CLinker.*;

public interface PanamaGLPainter {
    public ResourceScope getScope();

    public SegmentAllocator getAllocator();

    public MemorySegment alloc(double[] value);

    public MemorySegment alloc(float[] value);

    public MemorySegment alloc(int[] value);

    public MemorySegment alloc(String value);

    public String glGetString(int stringID);
}
