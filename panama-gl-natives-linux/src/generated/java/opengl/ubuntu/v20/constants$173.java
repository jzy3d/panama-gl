// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$173 {

    static final FunctionDescriptor PFNGLBINDVERTEXARRAYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBINDVERTEXARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$173.PFNGLBINDVERTEXARRAYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEVERTEXARRAYSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEVERTEXARRAYSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$173.PFNGLDELETEVERTEXARRAYSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENVERTEXARRAYSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENVERTEXARRAYSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$173.PFNGLGENVERTEXARRAYSPROC$FUNC, false
    );
}


