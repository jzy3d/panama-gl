// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$580 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$580.PFNGLPROGRAMUNIFORMMATRIX3X4FVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$580.PFNGLPROGRAMUNIFORMMATRIX4X3FVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXTUREBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$580.PFNGLTEXTUREBUFFEREXTPROC$FUNC, false
    );
}

