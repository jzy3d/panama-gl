// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$761 {

    static final FunctionDescriptor PFNGLPROGRAMENVPARAMETERI4UINVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMENVPARAMETERI4UINVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$761.PFNGLPROGRAMENVPARAMETERI4UINVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMENVPARAMETERI4UIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMENVPARAMETERI4UIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$761.PFNGLPROGRAMENVPARAMETERI4UIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$761.PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC$FUNC, false
    );
}

