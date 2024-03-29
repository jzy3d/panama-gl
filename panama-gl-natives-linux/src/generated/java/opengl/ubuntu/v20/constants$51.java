// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$51 {

    static final FunctionDescriptor glGetMapdv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMapdv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMapdv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$51.glGetMapdv$FUNC, false
    );
    static final FunctionDescriptor glGetMapfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMapfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMapfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$51.glGetMapfv$FUNC, false
    );
    static final FunctionDescriptor glGetMapiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetMapiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetMapiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$51.glGetMapiv$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord1d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glEvalCoord1d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord1d",
        "(D)V",
        constants$51.glEvalCoord1d$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord1f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glEvalCoord1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord1f",
        "(F)V",
        constants$51.glEvalCoord1f$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord1dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glEvalCoord1dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord1dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$51.glEvalCoord1dv$FUNC, false
    );
}


