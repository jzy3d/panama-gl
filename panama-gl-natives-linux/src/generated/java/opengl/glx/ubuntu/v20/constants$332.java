// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$332 {

    static final FunctionDescriptor PFNGLSCISSORINDEXEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSCISSORINDEXEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$332.PFNGLSCISSORINDEXEDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSCISSORINDEXEDVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSCISSORINDEXEDVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$332.PFNGLSCISSORINDEXEDVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDEPTHRANGEARRAYVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDEPTHRANGEARRAYVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$332.PFNGLDEPTHRANGEARRAYVPROC$FUNC, false
    );
}


