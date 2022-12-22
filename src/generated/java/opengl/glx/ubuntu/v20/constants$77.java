// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$77 {

    static final FunctionDescriptor XGetWMClientMachine$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XGetWMClientMachine$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMClientMachine",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$77.XGetWMClientMachine$FUNC, false
    );
    static final FunctionDescriptor XGetWMHints$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XGetWMHints$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMHints",
        "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$77.XGetWMHints$FUNC, false
    );
    static final FunctionDescriptor XGetWMIconName$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XGetWMIconName$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMIconName",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$77.XGetWMIconName$FUNC, false
    );
    static final FunctionDescriptor XGetWMName$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XGetWMName$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMName",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$77.XGetWMName$FUNC, false
    );
    static final FunctionDescriptor XGetWMNormalHints$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetWMNormalHints$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMNormalHints",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$77.XGetWMNormalHints$FUNC, false
    );
    static final FunctionDescriptor XGetWMSizeHints$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XGetWMSizeHints$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWMSizeHints",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$77.XGetWMSizeHints$FUNC, false
    );
}


