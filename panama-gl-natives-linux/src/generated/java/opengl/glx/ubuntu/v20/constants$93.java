// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$93 {

    static final FunctionDescriptor glDepthRange$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glDepthRange$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glDepthRange",
        "(DD)V",
        constants$93.glDepthRange$FUNC, false
    );
    static final FunctionDescriptor glClearAccum$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glClearAccum$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glClearAccum",
        "(FFFF)V",
        constants$93.glClearAccum$FUNC, false
    );
    static final FunctionDescriptor glAccum$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glAccum$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glAccum",
        "(IF)V",
        constants$93.glAccum$FUNC, false
    );
    static final FunctionDescriptor glMatrixMode$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glMatrixMode$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMatrixMode",
        "(I)V",
        constants$93.glMatrixMode$FUNC, false
    );
    static final FunctionDescriptor glOrtho$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glOrtho$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glOrtho",
        "(DDDDDD)V",
        constants$93.glOrtho$FUNC, false
    );
    static final FunctionDescriptor glFrustum$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glFrustum$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glFrustum",
        "(DDDDDD)V",
        constants$93.glFrustum$FUNC, false
    );
}


