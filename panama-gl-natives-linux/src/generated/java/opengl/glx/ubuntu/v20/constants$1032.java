// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1032 {

    static final FunctionDescriptor PFNGLXGETCURRENTDISPLAYEXTPROC$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle PFNGLXGETCURRENTDISPLAYEXTPROC$MH = RuntimeHelper.downcallHandle(
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$1032.PFNGLXGETCURRENTDISPLAYEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYCONTEXTINFOEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXQUERYCONTEXTINFOEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1032.PFNGLXQUERYCONTEXTINFOEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXGETCONTEXTIDEXTPROC$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLXGETCONTEXTIDEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$1032.PFNGLXGETCONTEXTIDEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXIMPORTCONTEXTEXTPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
}

