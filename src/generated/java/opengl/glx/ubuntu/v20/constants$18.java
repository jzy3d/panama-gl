// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$18 {

    static final FunctionDescriptor XIOErrorHandler$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XIOErrorHandler$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$18.XIOErrorHandler$FUNC, false
    );
    static final FunctionDescriptor XSetIOErrorHandler$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XSetIOErrorHandler$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetIOErrorHandler",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$18.XSetIOErrorHandler$FUNC, false
    );
    static final FunctionDescriptor XListPixmapFormats$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XListPixmapFormats$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XListPixmapFormats",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$18.XListPixmapFormats$FUNC, false
    );
    static final FunctionDescriptor XListDepths$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle XListDepths$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XListDepths",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$18.XListDepths$FUNC, false
    );
    static final FunctionDescriptor XReconfigureWMWindow$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle XReconfigureWMWindow$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XReconfigureWMWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;JIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$18.XReconfigureWMWindow$FUNC, false
    );
    static final FunctionDescriptor XGetWMProtocols$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetWMProtocols$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMProtocols",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$18.XGetWMProtocols$FUNC, false
    );
}


