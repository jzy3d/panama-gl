// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
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


