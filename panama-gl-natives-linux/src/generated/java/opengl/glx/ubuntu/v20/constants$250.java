// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$250 {

    static final FunctionDescriptor PFNGLCLEARBUFFERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARBUFFERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$250.PFNGLCLEARBUFFERFVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARBUFFERFIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_INT
    );
    static final MethodHandle PFNGLCLEARBUFFERFIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFI)V",
        constants$250.PFNGLCLEARBUFFERFIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETSTRINGIPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGETSTRINGIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$250.PFNGLGETSTRINGIPROC$FUNC, false
    );
}


