// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$651 {

    static final FunctionDescriptor PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$651.PFNGLPIXELTRANSFORMPARAMETERFEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$651.PFNGLPIXELTRANSFORMPARAMETERIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$651.PFNGLPIXELTRANSFORMPARAMETERFVEXTPROC$FUNC, false
    );
}


