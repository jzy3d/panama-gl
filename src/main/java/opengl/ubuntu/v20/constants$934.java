// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$934 {

    static final FunctionDescriptor gluGetTessProperty$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluGetTessProperty$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluGetTessProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$934.gluGetTessProperty$FUNC, false
    );
    static final FunctionDescriptor gluLoadSamplingMatrices$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gluLoadSamplingMatrices$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluLoadSamplingMatrices",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$934.gluLoadSamplingMatrices$FUNC, false
    );
    static final FunctionDescriptor gluLookAt$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle gluLookAt$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluLookAt",
        "(DDDDDDDDD)V",
        constants$934.gluLookAt$FUNC, false
    );
    static final FunctionDescriptor gluNewNurbsRenderer$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle gluNewNurbsRenderer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluNewNurbsRenderer",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.gluNewNurbsRenderer$FUNC, false
    );
    static final FunctionDescriptor gluNewQuadric$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle gluNewQuadric$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluNewQuadric",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.gluNewQuadric$FUNC, false
    );
    static final FunctionDescriptor gluNewTess$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle gluNewTess$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluNewTess",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.gluNewTess$FUNC, false
    );
}

