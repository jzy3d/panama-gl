// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$816 {

    static final FunctionDescriptor PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$816.PFNGLGETCOMBINEROUTPUTPARAMETERFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$816.PFNGLGETCOMBINEROUTPUTPARAMETERIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$816.PFNGLGETFINALCOMBINERINPUTPARAMETERFVNVPROC$FUNC, false
    );
}


