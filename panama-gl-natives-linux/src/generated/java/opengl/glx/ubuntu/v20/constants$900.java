// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$900 {

    static final FunctionDescriptor PFNGLCOMBINEROUTPUTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLCOMBINEROUTPUTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIBBB)V",
        constants$900.PFNGLCOMBINEROUTPUTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFINALCOMBINERINPUTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFINALCOMBINERINPUTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$900.PFNGLFINALCOMBINERINPUTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$900.PFNGLGETCOMBINERINPUTPARAMETERFVNVPROC$FUNC, false
    );
}


