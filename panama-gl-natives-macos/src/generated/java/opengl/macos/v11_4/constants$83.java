// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$83 {

    static final FunctionDescriptor glEvalCoord1f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glEvalCoord1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord1f",
        "(F)V",
        constants$83.glEvalCoord1f$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord1fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glEvalCoord1fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord1fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$83.glEvalCoord1fv$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord2d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glEvalCoord2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord2d",
        "(DD)V",
        constants$83.glEvalCoord2d$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord2dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glEvalCoord2dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord2dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$83.glEvalCoord2dv$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord2f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glEvalCoord2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord2f",
        "(FF)V",
        constants$83.glEvalCoord2f$FUNC, false
    );
    static final FunctionDescriptor glEvalCoord2fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glEvalCoord2fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalCoord2fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$83.glEvalCoord2fv$FUNC, false
    );
}

