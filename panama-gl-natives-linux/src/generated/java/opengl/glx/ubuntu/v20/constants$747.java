// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$747 {

    static final FunctionDescriptor PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$747.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWAITSEMAPHOREEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLWAITSEMAPHOREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$747.PFNGLWAITSEMAPHOREEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSIGNALSEMAPHOREEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSIGNALSEMAPHOREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$747.PFNGLSIGNALSEMAPHOREEXTPROC$FUNC, false
    );
}

