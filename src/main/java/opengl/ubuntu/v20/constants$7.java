// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$7 {

    static final FunctionDescriptor glHint$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glHint$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glHint",
        "(II)V",
        constants$7.glHint$FUNC, false
    );
    static final FunctionDescriptor glClearDepth$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glClearDepth$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearDepth",
        "(D)V",
        constants$7.glClearDepth$FUNC, false
    );
    static final FunctionDescriptor glDepthFunc$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glDepthFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDepthFunc",
        "(I)V",
        constants$7.glDepthFunc$FUNC, false
    );
    static final FunctionDescriptor glDepthMask$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR
    );
    static final MethodHandle glDepthMask$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDepthMask",
        "(B)V",
        constants$7.glDepthMask$FUNC, false
    );
    static final FunctionDescriptor glDepthRange$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glDepthRange$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDepthRange",
        "(DD)V",
        constants$7.glDepthRange$FUNC, false
    );
    static final FunctionDescriptor glClearAccum$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glClearAccum$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClearAccum",
        "(FFFF)V",
        constants$7.glClearAccum$FUNC, false
    );
}

