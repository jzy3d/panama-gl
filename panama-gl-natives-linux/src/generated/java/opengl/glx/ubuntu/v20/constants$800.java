// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$800 {

    static final FunctionDescriptor PFNGLWINDOWPOS3DMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLWINDOWPOS3DMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(DDD)V",
        constants$800.PFNGLWINDOWPOS3DMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3DVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3DVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$800.PFNGLWINDOWPOS3DVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3FMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLWINDOWPOS3FMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(FFF)V",
        constants$800.PFNGLWINDOWPOS3FMESAPROC$FUNC, false
    );
}


