// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$716 {

    static final FunctionDescriptor PFNGLWINDOWPOS3IMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLWINDOWPOS3IMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$716.PFNGLWINDOWPOS3IMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3IVMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3IVMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$716.PFNGLWINDOWPOS3IVMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3SMESAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLWINDOWPOS3SMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$716.PFNGLWINDOWPOS3SMESAPROC$FUNC, false
    );
}

