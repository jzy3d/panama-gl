// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$160 {

    static final FunctionDescriptor glIsShader$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsShader$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsShader",
        "(I)B",
        constants$160.glIsShader$FUNC, false
    );
    static final FunctionDescriptor glIsProgram$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsProgram$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsProgram",
        "(I)B",
        constants$160.glIsProgram$FUNC, false
    );
    static final FunctionDescriptor glGetShaderiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetShaderiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetShaderiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$160.glGetShaderiv$FUNC, false
    );
    static final FunctionDescriptor glGetProgramiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetProgramiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetProgramiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$160.glGetProgramiv$FUNC, false
    );
    static final FunctionDescriptor glGetAttachedShaders$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetAttachedShaders$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetAttachedShaders",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$160.glGetAttachedShaders$FUNC, false
    );
    static final FunctionDescriptor glGetShaderInfoLog$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetShaderInfoLog$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetShaderInfoLog",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$160.glGetShaderInfoLog$FUNC, false
    );
}


