// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$125 {

    static final FunctionDescriptor glVertex2d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertex2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2d",
        "(DD)V",
        constants$125.glVertex2d$FUNC, false
    );
    static final FunctionDescriptor glVertex2dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex2dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$125.glVertex2dv$FUNC, false
    );
    static final FunctionDescriptor glVertex2f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertex2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2f",
        "(FF)V",
        constants$125.glVertex2f$FUNC, false
    );
    static final FunctionDescriptor glVertex2fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex2fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$125.glVertex2fv$FUNC, false
    );
    static final FunctionDescriptor glVertex2i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glVertex2i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2i",
        "(II)V",
        constants$125.glVertex2i$FUNC, false
    );
    static final FunctionDescriptor glVertex2iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex2iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$125.glVertex2iv$FUNC, false
    );
}


