// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$618 {

    static final FunctionDescriptor PFNGLCOPYTEXSUBIMAGE2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYTEXSUBIMAGE2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIII)V",
        constants$618.PFNGLCOPYTEXSUBIMAGE2DEXTPROC$FUNC, false
    );
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
        constants$618.PFNGLCOPYTEXSUBIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCULLPARAMETERDVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCULLPARAMETERDVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$618.PFNGLCULLPARAMETERDVEXTPROC$FUNC, false
    );
}


