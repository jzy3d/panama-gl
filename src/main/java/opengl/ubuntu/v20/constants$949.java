// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$949 {

    static final FunctionDescriptor glutDetachMenu$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutDetachMenu$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutDetachMenu",
        "(I)V",
        constants$949.glutDetachMenu$FUNC, false
    );
    static final FunctionDescriptor glutTimerFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutTimerFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$949.glutTimerFunc$callback$FUNC, false
    );
    static final FunctionDescriptor glutTimerFunc$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutTimerFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutTimerFunc",
        "(ILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$949.glutTimerFunc$FUNC, false
    );
    static final FunctionDescriptor glutIdleFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutIdleFunc$callback$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$949.glutIdleFunc$callback$FUNC, false
    );
}


