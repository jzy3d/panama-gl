// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$204 {

    static final FunctionDescriptor PFNGLGETACTIVEUNIFORMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETACTIVEUNIFORMPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$204.PFNGLGETACTIVEUNIFORMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETATTACHEDSHADERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETATTACHEDSHADERSPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$204.PFNGLGETATTACHEDSHADERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETATTRIBLOCATIONPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETATTRIBLOCATIONPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$204.PFNGLGETATTRIBLOCATIONPROC$FUNC, false
    );
}

