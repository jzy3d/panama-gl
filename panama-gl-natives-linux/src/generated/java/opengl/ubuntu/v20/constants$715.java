// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$715 {

    static final FunctionDescriptor PFNGLWINDOWPOS3DVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3DVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$715.PFNGLWINDOWPOS3DVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3FMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLWINDOWPOS3FMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(FFF)V",
        constants$715.PFNGLWINDOWPOS3FMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3FVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3FVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$715.PFNGLWINDOWPOS3FVMESAPROC$FUNC, false
    );
}


