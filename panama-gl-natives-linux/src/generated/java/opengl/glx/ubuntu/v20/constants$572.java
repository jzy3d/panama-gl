// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$572 {

    static final FunctionDescriptor PFNGLELEMENTPOINTERATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLELEMENTPOINTERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$572.PFNGLELEMENTPOINTERATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWELEMENTARRAYATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWELEMENTARRAYATIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$572.PFNGLDRAWELEMENTARRAYATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWRANGEELEMENTARRAYATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWRANGEELEMENTARRAYATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$572.PFNGLDRAWRANGEELEMENTARRAYATIPROC$FUNC, false
    );
}


