// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$718 {

    static final FunctionDescriptor PFNGLWINDOWPOS4FMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLWINDOWPOS4FMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFF)V",
        constants$718.PFNGLWINDOWPOS4FMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS4FVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS4FVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$718.PFNGLWINDOWPOS4FVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS4IMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLWINDOWPOS4IMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$718.PFNGLWINDOWPOS4IMESAPROC$FUNC, false
    );
}

