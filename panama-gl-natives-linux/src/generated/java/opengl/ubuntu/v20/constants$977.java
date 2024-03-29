// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$977 {

    static final FunctionDescriptor mrand48_r$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle mrand48_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "mrand48_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$977.mrand48_r$FUNC, false
    );
    static final FunctionDescriptor jrand48_r$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle jrand48_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "jrand48_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$977.jrand48_r$FUNC, false
    );
    static final FunctionDescriptor srand48_r$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle srand48_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "srand48_r",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$977.srand48_r$FUNC, false
    );
    static final FunctionDescriptor seed48_r$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle seed48_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "seed48_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$977.seed48_r$FUNC, false
    );
    static final FunctionDescriptor lcong48_r$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle lcong48_r$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "lcong48_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$977.lcong48_r$FUNC, false
    );
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "malloc",
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$977.malloc$FUNC, false
    );
}


