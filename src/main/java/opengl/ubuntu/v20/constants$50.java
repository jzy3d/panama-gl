// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$50 {

    static final FunctionDescriptor glCopyTexSubImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyTexSubImage1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexSubImage1D",
        "(IIIIII)V",
        constants$50.glCopyTexSubImage1D$FUNC, false
    );
    static final FunctionDescriptor glCopyTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexSubImage2D",
        "(IIIIIIII)V",
        constants$50.glCopyTexSubImage2D$FUNC, false
    );
    static final FunctionDescriptor glMap1d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMap1d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMap1d",
        "(IDDIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glMap1d$FUNC, false
    );
    static final FunctionDescriptor glMap1f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMap1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMap1f",
        "(IFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glMap1f$FUNC, false
    );
    static final FunctionDescriptor glMap2d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMap2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMap2d",
        "(IDDIIDDIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glMap2d$FUNC, false
    );
    static final FunctionDescriptor glMap2f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMap2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMap2f",
        "(IFFIIFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glMap2f$FUNC, false
    );
}


