// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$189 {

    static final FunctionDescriptor glutIdleFunc$func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutIdleFunc$func$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$189.glutIdleFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutIdleFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutIdleFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutIdleFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$189.glutIdleFunc$FUNC, false
    );
    static final FunctionDescriptor glutTimerFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutTimerFunc$func$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$189.glutTimerFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutTimerFunc$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutTimerFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutTimerFunc",
        "(ILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$189.glutTimerFunc$FUNC, false
    );
    static final FunctionDescriptor glutMenuStateFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
}

