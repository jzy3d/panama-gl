// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$70 {

    static final FunctionDescriptor glClipPlane$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glClipPlane$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClipPlane",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$70.glClipPlane$FUNC, false
    );
    static final FunctionDescriptor glColor3b$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glColor3b$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3b",
        "(BBB)V",
        constants$70.glColor3b$FUNC, false
    );
    static final FunctionDescriptor glColor3bv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor3bv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3bv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$70.glColor3bv$FUNC, false
    );
    static final FunctionDescriptor glColor3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glColor3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3d",
        "(DDD)V",
        constants$70.glColor3d$FUNC, false
    );
    static final FunctionDescriptor glColor3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$70.glColor3dv$FUNC, false
    );
    static final FunctionDescriptor glColor3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glColor3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3f",
        "(FFF)V",
        constants$70.glColor3f$FUNC, false
    );
}


