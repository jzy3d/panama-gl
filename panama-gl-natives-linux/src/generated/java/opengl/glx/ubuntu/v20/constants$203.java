// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$203 {

    static final FunctionDescriptor PFNGLDISABLEVERTEXATTRIBARRAYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDISABLEVERTEXATTRIBARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$203.PFNGLDISABLEVERTEXATTRIBARRAYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENABLEVERTEXATTRIBARRAYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENABLEVERTEXATTRIBARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$203.PFNGLENABLEVERTEXATTRIBARRAYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETACTIVEATTRIBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETACTIVEATTRIBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$203.PFNGLGETACTIVEATTRIBPROC$FUNC, false
    );
}

