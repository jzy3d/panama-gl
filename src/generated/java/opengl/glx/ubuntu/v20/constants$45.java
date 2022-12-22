// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$45 {

    static final FunctionDescriptor XProtocolVersion$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XProtocolVersion$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XProtocolVersion",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$45.XProtocolVersion$FUNC, false
    );
    static final FunctionDescriptor XPutBackEvent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XPutBackEvent$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XPutBackEvent",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$45.XPutBackEvent$FUNC, false
    );
    static final FunctionDescriptor XPutImage$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle XPutImage$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XPutImage",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIII)I",
        constants$45.XPutImage$FUNC, false
    );
    static final FunctionDescriptor XQLength$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XQLength$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XQLength",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$45.XQLength$FUNC, false
    );
    static final FunctionDescriptor XQueryBestCursor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XQueryBestCursor$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XQueryBestCursor",
        "(Ljdk/incubator/foreign/MemoryAddress;JIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$45.XQueryBestCursor$FUNC, false
    );
    static final FunctionDescriptor XQueryBestSize$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XQueryBestSize$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XQueryBestSize",
        "(Ljdk/incubator/foreign/MemoryAddress;IJIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$45.XQueryBestSize$FUNC, false
    );
}


