// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$660 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4IEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4IEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$660.PFNGLPROGRAMUNIFORM4IEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$660.PFNGLPROGRAMUNIFORM1FVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$660.PFNGLPROGRAMUNIFORM2FVEXTPROC$FUNC, false
    );
}


