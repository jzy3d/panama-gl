// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$536 {

    static final FunctionDescriptor GLDEBUGPROCAMD$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GLDEBUGPROCAMD$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$536.GLDEBUGPROCAMD$FUNC, false
    );
    static final FunctionDescriptor PFNGLDEBUGMESSAGEENABLEAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle PFNGLDEBUGMESSAGEENABLEAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;B)V",
        constants$536.PFNGLDEBUGMESSAGEENABLEAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDEBUGMESSAGEINSERTAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$536.PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC, false
    );
}


