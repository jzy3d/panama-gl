// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$143 {

    static final FunctionDescriptor PFNGLCOPYTEXSUBIMAGE3DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYTEXSUBIMAGE3DPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIII)V",
        constants$143.PFNGLCOPYTEXSUBIMAGE3DPROC$FUNC, false
    );
    static final FunctionDescriptor glColorTable$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorTable$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColorTable",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glColorTable$FUNC, false
    );
    static final FunctionDescriptor glColorSubTable$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorSubTable$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColorSubTable",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glColorSubTable$FUNC, false
    );
    static final FunctionDescriptor glColorTableParameteriv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorTableParameteriv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColorTableParameteriv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glColorTableParameteriv$FUNC, false
    );
    static final FunctionDescriptor glColorTableParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorTableParameterfv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColorTableParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glColorTableParameterfv$FUNC, false
    );
}


