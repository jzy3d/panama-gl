// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$758 {

    static final FunctionDescriptor PFNGLPROGRAMLOCALPARAMETERI4INVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMLOCALPARAMETERI4INVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$758.PFNGLPROGRAMLOCALPARAMETERI4INVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$758.PFNGLPROGRAMLOCALPARAMETERI4IVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$758.PFNGLPROGRAMLOCALPARAMETERSI4IVNVPROC$FUNC, false
    );
}


