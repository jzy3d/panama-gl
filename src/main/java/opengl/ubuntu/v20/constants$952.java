// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$952 {

    static final FunctionDescriptor glutVisibilityFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutVisibilityFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutVisibilityFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$952.glutVisibilityFunc$FUNC, false
    );
    static final FunctionDescriptor glutDisplayFunc$callback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutDisplayFunc$callback$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$952.glutDisplayFunc$callback$FUNC, false
    );
    static final FunctionDescriptor glutDisplayFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutDisplayFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutDisplayFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$952.glutDisplayFunc$FUNC, false
    );
    static final FunctionDescriptor glutMouseFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutMouseFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$952.glutMouseFunc$callback$FUNC, false
    );
}


