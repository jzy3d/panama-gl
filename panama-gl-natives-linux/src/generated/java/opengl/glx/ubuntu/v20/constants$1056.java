// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1056 {

    static final FunctionDescriptor PFNGLXBINDCHANNELTOWINDOWSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLXBINDCHANNELTOWINDOWSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IIJ)I",
        constants$1056.PFNGLXBINDCHANNELTOWINDOWSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXCHANNELRECTSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLXCHANNELRECTSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IIIIII)I",
        constants$1056.PFNGLXCHANNELRECTSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYCHANNELRECTSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLXQUERYCHANNELRECTSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1056.PFNGLXQUERYCHANNELRECTSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYCHANNELDELTASSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
}


