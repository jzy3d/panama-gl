// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$133 {

    static final FunctionDescriptor glGetTexLevelParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexLevelParameteriv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetTexLevelParameteriv",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$133.glGetTexLevelParameteriv$FUNC, false
    );
    static final FunctionDescriptor glTexImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexImage1D$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexImage1D",
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$133.glTexImage1D$FUNC, false
    );
    static final FunctionDescriptor glTexImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexImage2D$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexImage2D",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$133.glTexImage2D$FUNC, false
    );
    static final FunctionDescriptor glGetTexImage$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexImage$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetTexImage",
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$133.glGetTexImage$FUNC, false
    );
    static final FunctionDescriptor glGenTextures$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenTextures$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGenTextures",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$133.glGenTextures$FUNC, false
    );
    static final FunctionDescriptor glDeleteTextures$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteTextures$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glDeleteTextures",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$133.glDeleteTextures$FUNC, false
    );
}


