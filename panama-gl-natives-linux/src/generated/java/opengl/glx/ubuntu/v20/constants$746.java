// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$746 {

    static final FunctionDescriptor PFNGLDELETESEMAPHORESEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETESEMAPHORESEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$746.PFNGLDELETESEMAPHORESEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISSEMAPHOREEXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISSEMAPHOREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$746.PFNGLISSEMAPHOREEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSEMAPHOREPARAMETERUI64VEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSEMAPHOREPARAMETERUI64VEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$746.PFNGLSEMAPHOREPARAMETERUI64VEXTPROC$FUNC, false
    );
}


