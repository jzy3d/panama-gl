// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$130 {

    static final FunctionDescriptor glTexGenfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexGenfv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexGenfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.glTexGenfv$FUNC, false
    );
    static final FunctionDescriptor glTexGeniv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexGeniv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexGeniv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.glTexGeniv$FUNC, false
    );
    static final FunctionDescriptor glGetTexGendv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexGendv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetTexGendv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.glGetTexGendv$FUNC, false
    );
    static final FunctionDescriptor glGetTexGenfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexGenfv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetTexGenfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.glGetTexGenfv$FUNC, false
    );
    static final FunctionDescriptor glGetTexGeniv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexGeniv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGetTexGeniv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$130.glGetTexGeniv$FUNC, false
    );
    static final FunctionDescriptor glTexEnvf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glTexEnvf$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexEnvf",
        "(IIF)V",
        constants$130.glTexEnvf$FUNC, false
    );
}


