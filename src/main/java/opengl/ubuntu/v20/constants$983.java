// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$983 {

    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "system",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$983.system$FUNC, false
    );
    static final FunctionDescriptor realpath$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle realpath$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "realpath",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$983.realpath$FUNC, false
    );
    static final FunctionDescriptor __compar_fn_t$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle __compar_fn_t$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$983.__compar_fn_t$FUNC, false
    );
    static final FunctionDescriptor bsearch$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle bsearch$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "bsearch",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$983.bsearch$FUNC, false
    );
    static final FunctionDescriptor qsort$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle qsort$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "qsort",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$983.qsort$FUNC, false
    );
}


