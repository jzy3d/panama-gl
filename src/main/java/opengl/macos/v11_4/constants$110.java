// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$110 {

    static final FunctionDescriptor glRasterPos3iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos3iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$110.glRasterPos3iv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRasterPos3s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3s",
        "(SSS)V",
        constants$110.glRasterPos3s$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos3sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos3sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$110.glRasterPos3sv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRasterPos4d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos4d",
        "(DDDD)V",
        constants$110.glRasterPos4d$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glRasterPos4dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos4dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$110.glRasterPos4dv$FUNC, false
    );
    static final FunctionDescriptor glRasterPos4f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRasterPos4f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos4f",
        "(FFFF)V",
        constants$110.glRasterPos4f$FUNC, false
    );
}


