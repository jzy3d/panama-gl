// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$338 {

    static final FunctionDescriptor GLDEBUGPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GLDEBUGPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$338.GLDEBUGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$338.PFNGLCLEARBUFFERDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$338.PFNGLCLEARBUFFERSUBDATAPROC$FUNC, false
    );
}

