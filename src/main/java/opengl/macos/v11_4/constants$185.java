// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$185 {

    static final FunctionDescriptor glutDisplayFunc$func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutDisplayFunc$func$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$185.glutDisplayFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutDisplayFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutDisplayFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutDisplayFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$185.glutDisplayFunc$FUNC, false
    );
    static final FunctionDescriptor glutReshapeFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutReshapeFunc$func$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$185.glutReshapeFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutReshapeFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutReshapeFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutReshapeFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$185.glutReshapeFunc$FUNC, false
    );
    static final FunctionDescriptor glutKeyboardFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_INT,
        C_INT
    );
}


