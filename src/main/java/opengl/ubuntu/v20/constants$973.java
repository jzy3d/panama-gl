// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$973 {

    static final FunctionDescriptor random$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle random$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "random",
        "()J",
        constants$973.random$FUNC, false
    );
    static final FunctionDescriptor srandom$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle srandom$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "srandom",
        "(I)V",
        constants$973.srandom$FUNC, false
    );
    static final FunctionDescriptor initstate$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle initstate$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "initstate",
        "(ILjdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$973.initstate$FUNC, false
    );
    static final FunctionDescriptor setstate$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle setstate$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "setstate",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$973.setstate$FUNC, false
    );
    static final FunctionDescriptor random_r$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle random_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "random_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$973.random_r$FUNC, false
    );
    static final FunctionDescriptor srandom_r$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle srandom_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "srandom_r",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$973.srandom_r$FUNC, false
    );
}


