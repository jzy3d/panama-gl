// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$533 {

    static final FunctionDescriptor PFNGLCOPYTEXSUBIMAGE3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYTEXSUBIMAGE3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIII)V",
        constants$533.PFNGLCOPYTEXSUBIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCULLPARAMETERDVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCULLPARAMETERDVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$533.PFNGLCULLPARAMETERDVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCULLPARAMETERFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCULLPARAMETERFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$533.PFNGLCULLPARAMETERFVEXTPROC$FUNC, false
    );
}

