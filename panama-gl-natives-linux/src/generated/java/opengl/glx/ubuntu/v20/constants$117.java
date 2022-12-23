// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$117 {

    static final FunctionDescriptor glRasterPos3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRasterPos3i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos3i",
        "(III)V",
        constants$117.glRasterPos3i$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRasterPos3s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos3s",
        "(SSS)V",
        constants$117.glRasterPos3s$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRasterPos4d$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos4d",
        "(DDDD)V",
        constants$117.glRasterPos4d$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRasterPos4f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos4f",
        "(FFFF)V",
        constants$117.glRasterPos4f$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRasterPos4i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos4i",
        "(IIII)V",
        constants$117.glRasterPos4i$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRasterPos4s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos4s",
        "(SSSS)V",
        constants$117.glRasterPos4s$FUNC, false
    );
}


