// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$101 {

    static final FunctionDescriptor PFNGLWINDOWPOS2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLWINDOWPOS2DPROC$MH = RuntimeHelper.downcallHandle(
        "(DD)V",
        constants$101.PFNGLWINDOWPOS2DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS2DVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$101.PFNGLWINDOWPOS2DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS2FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLWINDOWPOS2FPROC$MH = RuntimeHelper.downcallHandle(
        "(FF)V",
        constants$101.PFNGLWINDOWPOS2FPROC$FUNC, false
    );
}


