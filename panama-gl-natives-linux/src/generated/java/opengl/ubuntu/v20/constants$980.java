// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$980 {

    static final FunctionDescriptor at_quick_exit$__func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle at_quick_exit$__func$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$980.at_quick_exit$__func$FUNC, false
    );
    static final FunctionDescriptor at_quick_exit$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle at_quick_exit$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "at_quick_exit",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$980.at_quick_exit$FUNC, false
    );
    static final FunctionDescriptor on_exit$__func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle on_exit$__func$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$980.on_exit$__func$FUNC, false
    );
    static final FunctionDescriptor on_exit$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle on_exit$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "on_exit",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$980.on_exit$FUNC, false
    );
}


