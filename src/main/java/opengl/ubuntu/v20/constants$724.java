// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$724 {

    static final FunctionDescriptor PFNGLSIGNALSEMAPHOREUI64NVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSIGNALSEMAPHOREUI64NVXPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$724.PFNGLSIGNALSEMAPHOREUI64NVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWAITSEMAPHOREUI64NVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLWAITSEMAPHOREUI64NVXPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$724.PFNGLWAITSEMAPHOREUI64NVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$724.PFNGLCLIENTWAITSEMAPHOREUI64NVXPROC$FUNC, false
    );
}


