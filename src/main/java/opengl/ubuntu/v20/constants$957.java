// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$957 {

    static final FunctionDescriptor glutMenuStatusFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutMenuStatusFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutMenuStatusFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$957.glutMenuStatusFunc$FUNC, false
    );
    static final FunctionDescriptor glutOverlayDisplayFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutOverlayDisplayFunc$callback$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$957.glutOverlayDisplayFunc$callback$FUNC, false
    );
    static final FunctionDescriptor glutOverlayDisplayFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutOverlayDisplayFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutOverlayDisplayFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$957.glutOverlayDisplayFunc$FUNC, false
    );
    static final FunctionDescriptor glutWindowStatusFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutWindowStatusFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$957.glutWindowStatusFunc$callback$FUNC, false
    );
}


