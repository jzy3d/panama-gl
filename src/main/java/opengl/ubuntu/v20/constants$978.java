// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$978 {

    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "calloc",
        "(JJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$978.calloc$FUNC, false
    );
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "realloc",
        "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$978.realloc$FUNC, false
    );
    static final FunctionDescriptor reallocarray$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle reallocarray$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "reallocarray",
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$978.reallocarray$FUNC, false
    );
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$978.free$FUNC, false
    );
    static final FunctionDescriptor alloca$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle alloca$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "alloca",
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$978.alloca$FUNC, false
    );
    static final FunctionDescriptor valloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle valloc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "valloc",
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$978.valloc$FUNC, false
    );
}


