// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$126 {

    static final FunctionDescriptor glVertex2s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glVertex2s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2s",
        "(SS)V",
        constants$126.glVertex2s$FUNC, false
    );
    static final FunctionDescriptor glVertex2sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex2sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex2sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$126.glVertex2sv$FUNC, false
    );
    static final FunctionDescriptor glVertex3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertex3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex3d",
        "(DDD)V",
        constants$126.glVertex3d$FUNC, false
    );
    static final FunctionDescriptor glVertex3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$126.glVertex3dv$FUNC, false
    );
    static final FunctionDescriptor glVertex3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertex3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex3f",
        "(FFF)V",
        constants$126.glVertex3f$FUNC, false
    );
    static final FunctionDescriptor glVertex3fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex3fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$126.glVertex3fv$FUNC, false
    );
}


