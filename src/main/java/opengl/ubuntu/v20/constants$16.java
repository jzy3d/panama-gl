// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$16 {

    static final FunctionDescriptor glVertex4dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex4dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.glVertex4dv$FUNC, false
    );
    static final FunctionDescriptor glVertex4fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex4fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.glVertex4fv$FUNC, false
    );
    static final FunctionDescriptor glVertex4iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex4iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.glVertex4iv$FUNC, false
    );
    static final FunctionDescriptor glVertex4sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glVertex4sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertex4sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.glVertex4sv$FUNC, false
    );
    static final FunctionDescriptor glNormal3b$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glNormal3b$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3b",
        "(BBB)V",
        constants$16.glNormal3b$FUNC, false
    );
    static final FunctionDescriptor glNormal3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glNormal3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3d",
        "(DDD)V",
        constants$16.glNormal3d$FUNC, false
    );
}


