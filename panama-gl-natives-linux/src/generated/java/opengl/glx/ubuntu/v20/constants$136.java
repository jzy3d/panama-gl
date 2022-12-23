// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$136 {

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
        glx_h.LIBRARIES, "glMap2d",
        "(IDDIIDDIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$136.glMap2d$FUNC, false
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
        glx_h.LIBRARIES, "glMap2f",
        "(IFFIIFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$136.glMap2f$FUNC, false
    );
    static final FunctionDescriptor glGetMapdv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMapdv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetMapdv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$136.glGetMapdv$FUNC, false
    );
    static final FunctionDescriptor glGetMapfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMapfv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetMapfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$136.glGetMapfv$FUNC, false
    );
    static final FunctionDescriptor glGetMapiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMapiv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetMapiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$136.glGetMapiv$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord1d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glEvalCoord1d$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glEvalCoord1d",
        "(D)V",
        constants$136.glEvalCoord1d$FUNC, false
    );
}


