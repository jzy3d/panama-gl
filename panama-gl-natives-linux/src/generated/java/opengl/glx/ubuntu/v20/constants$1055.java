// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1055 {

    static final FunctionDescriptor PFNGLXBINDSWAPBARRIERSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLXBINDSWAPBARRIERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JI)V",
        constants$1055.PFNGLXBINDSWAPBARRIERSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYMAXSWAPBARRIERSSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXQUERYMAXSWAPBARRIERSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1055.PFNGLXQUERYMAXSWAPBARRIERSSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXJOINSWAPGROUPSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLXJOINSWAPGROUPSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)V",
        constants$1055.PFNGLXJOINSWAPGROUPSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXBINDCHANNELTOWINDOWSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_LONG
    );
}

