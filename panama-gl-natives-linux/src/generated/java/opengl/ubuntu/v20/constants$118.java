// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$118 {

    static final FunctionDescriptor PFNGLENABLEVERTEXATTRIBARRAYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENABLEVERTEXATTRIBARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$118.PFNGLENABLEVERTEXATTRIBARRAYPROC$FUNC, false
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
        constants$118.PFNGLGETACTIVEATTRIBPROC$FUNC, false
    );
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
        constants$118.PFNGLGETACTIVEUNIFORMPROC$FUNC, false
    );
}


