// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$93 {

    static final FunctionDescriptor PFNGLPOINTPARAMETERIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPOINTPARAMETERIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$93.PFNGLPOINTPARAMETERIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOINTPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPOINTPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$93.PFNGLPOINTPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFOGCOORDFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle PFNGLFOGCOORDFPROC$MH = RuntimeHelper.downcallHandle(
        "(F)V",
        constants$93.PFNGLFOGCOORDFPROC$FUNC, false
    );
}


