// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$311 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1FVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$311.PFNGLPROGRAMUNIFORM1FVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1DPROC$MH = RuntimeHelper.downcallHandle(
        "(IID)V",
        constants$311.PFNGLPROGRAMUNIFORM1DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$311.PFNGLPROGRAMUNIFORM1DVPROC$FUNC, false
    );
}


