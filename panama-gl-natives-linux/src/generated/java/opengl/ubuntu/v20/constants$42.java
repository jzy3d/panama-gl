// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$42 {

    static final FunctionDescriptor glPixelMapusv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glPixelMapusv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelMapusv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$42.glPixelMapusv$FUNC, false
    );
    static final FunctionDescriptor glGetPixelMapfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetPixelMapfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetPixelMapfv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$42.glGetPixelMapfv$FUNC, false
    );
    static final FunctionDescriptor glGetPixelMapuiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetPixelMapuiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetPixelMapuiv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$42.glGetPixelMapuiv$FUNC, false
    );
    static final FunctionDescriptor glGetPixelMapusv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetPixelMapusv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetPixelMapusv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$42.glGetPixelMapusv$FUNC, false
    );
    static final FunctionDescriptor glBitmap$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_POINTER
    );
    static final MethodHandle glBitmap$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBitmap",
        "(IIFFFFLjdk/incubator/foreign/MemoryAddress;)V",
        constants$42.glBitmap$FUNC, false
    );
    static final FunctionDescriptor glReadPixels$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glReadPixels$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glReadPixels",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$42.glReadPixels$FUNC, false
    );
}


