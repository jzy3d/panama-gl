// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$454 {

    static final FunctionDescriptor PFNGLGETATTACHEDOBJECTSARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETATTACHEDOBJECTSARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$454.PFNGLGETATTACHEDOBJECTSARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETUNIFORMLOCATIONARBPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNIFORMLOCATIONARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$454.PFNGLGETUNIFORMLOCATIONARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETACTIVEUNIFORMARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETACTIVEUNIFORMARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$454.PFNGLGETACTIVEUNIFORMARBPROC$FUNC, false
    );
}

