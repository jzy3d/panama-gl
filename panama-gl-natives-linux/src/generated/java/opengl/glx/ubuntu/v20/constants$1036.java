// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1036 {

    static final FunctionDescriptor PFNGLXQUERYCURRENTRENDERERSTRINGMESAPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLXQUERYCURRENTRENDERERSTRINGMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1036.PFNGLXQUERYCURRENTRENDERERSTRINGMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYRENDERERINTEGERMESAPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXQUERYRENDERERINTEGERMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1036.PFNGLXQUERYRENDERERINTEGERMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXQUERYRENDERERSTRINGMESAPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLXQUERYRENDERERSTRINGMESAPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;III)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1036.PFNGLXQUERYRENDERERSTRINGMESAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXRELEASEBUFFERSMESAPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
}


