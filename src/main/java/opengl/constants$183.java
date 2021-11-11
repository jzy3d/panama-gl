// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$183 {

    static final FunctionDescriptor glutCreateMenu$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle glutCreateMenu$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutCreateMenu",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$183.glutCreateMenu$FUNC, false
    );
    static final FunctionDescriptor glutDestroyMenu$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutDestroyMenu$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutDestroyMenu",
        "(I)V",
        constants$183.glutDestroyMenu$FUNC, false
    );
    static final FunctionDescriptor glutGetMenu$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle glutGetMenu$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutGetMenu",
        "()I",
        constants$183.glutGetMenu$FUNC, false
    );
    static final FunctionDescriptor glutSetMenu$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutSetMenu$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSetMenu",
        "(I)V",
        constants$183.glutSetMenu$FUNC, false
    );
    static final FunctionDescriptor glutAddMenuEntry$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutAddMenuEntry$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutAddMenuEntry",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$183.glutAddMenuEntry$FUNC, false
    );
    static final FunctionDescriptor glutAddSubMenu$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle glutAddSubMenu$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutAddSubMenu",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$183.glutAddSubMenu$FUNC, false
    );
}

