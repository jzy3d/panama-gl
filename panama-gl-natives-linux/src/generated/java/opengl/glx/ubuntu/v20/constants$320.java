// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$320 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$320.PFNGLPROGRAMUNIFORM4UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$320.PFNGLPROGRAMUNIFORM4UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORMMATRIX2FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORMMATRIX2FVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$320.PFNGLPROGRAMUNIFORMMATRIX2FVPROC$FUNC, false
    );
}

