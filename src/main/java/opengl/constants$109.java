// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$109 {

    static final FunctionDescriptor glRasterPos2sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos2sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$109.glRasterPos2sv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRasterPos3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3d",
        "(DDD)V",
        constants$109.glRasterPos3d$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$109.glRasterPos3dv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRasterPos3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3f",
        "(FFF)V",
        constants$109.glRasterPos3f$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$109.glRasterPos3fv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRasterPos3i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3i",
        "(III)V",
        constants$109.glRasterPos3i$FUNC, false
    );
}


