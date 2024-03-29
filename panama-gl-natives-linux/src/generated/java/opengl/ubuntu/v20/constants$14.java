// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$14 {

    static final FunctionDescriptor glVertex4d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertex4d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4d",
        "(DDDD)V",
        constants$14.glVertex4d$FUNC, false
    );
    static final FunctionDescriptor glVertex4f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertex4f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4f",
        "(FFFF)V",
        constants$14.glVertex4f$FUNC, false
    );
    static final FunctionDescriptor glVertex4i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glVertex4i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4i",
        "(IIII)V",
        constants$14.glVertex4i$FUNC, false
    );
    static final FunctionDescriptor glVertex4s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glVertex4s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4s",
        "(SSSS)V",
        constants$14.glVertex4s$FUNC, false
    );
    static final FunctionDescriptor glVertex2dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex2dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$14.glVertex2dv$FUNC, false
    );
    static final FunctionDescriptor glVertex2fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex2fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$14.glVertex2fv$FUNC, false
    );
}


