// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$86 {

    static final FunctionDescriptor glFrustum$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glFrustum$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFrustum",
        "(DDDDDD)V",
        constants$86.glFrustum$FUNC, false
    );
    static final FunctionDescriptor glGenLists$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glGenLists$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenLists",
        "(I)I",
        constants$86.glGenLists$FUNC, false
    );
    static final FunctionDescriptor glGenTextures$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenTextures$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenTextures",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$86.glGenTextures$FUNC, false
    );
    static final FunctionDescriptor glGetBooleanv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetBooleanv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetBooleanv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$86.glGetBooleanv$FUNC, false
    );
    static final FunctionDescriptor glGetClipPlane$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetClipPlane$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetClipPlane",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$86.glGetClipPlane$FUNC, false
    );
    static final FunctionDescriptor glGetColorTable$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetColorTable$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetColorTable",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$86.glGetColorTable$FUNC, false
    );
}


