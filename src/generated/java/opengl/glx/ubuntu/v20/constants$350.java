// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$350 {

    static final FunctionDescriptor PFNGLDEBUGMESSAGECALLBACKPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLDEBUGMESSAGECALLBACKPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$350.PFNGLDEBUGMESSAGECALLBACKPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETDEBUGMESSAGELOGPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETDEBUGMESSAGELOGPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$350.PFNGLGETDEBUGMESSAGELOGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPUSHDEBUGGROUPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPUSHDEBUGGROUPPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$350.PFNGLPUSHDEBUGGROUPPROC$FUNC, false
    );
}


