// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$259 {

    static final FunctionDescriptor PFNGLGENVERTEXARRAYSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENVERTEXARRAYSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$259.PFNGLGENVERTEXARRAYSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISVERTEXARRAYPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISVERTEXARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$259.PFNGLISVERTEXARRAYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWARRAYSINSTANCEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWARRAYSINSTANCEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$259.PFNGLDRAWARRAYSINSTANCEDPROC$FUNC, false
    );
}


