// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$297 {

    static final FunctionDescriptor PFNGLVERTEXARRAYELEMENTBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYELEMENTBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$297.PFNGLVERTEXARRAYELEMENTBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJI)V",
        constants$297.PFNGLVERTEXARRAYVERTEXBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$297.PFNGLVERTEXARRAYVERTEXBUFFERSPROC$FUNC, false
    );
}

