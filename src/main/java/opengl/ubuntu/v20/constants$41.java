// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$41 {

    static final FunctionDescriptor glPixelStoref$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glPixelStoref$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelStoref",
        "(IF)V",
        constants$41.glPixelStoref$FUNC, false
    );
    static final FunctionDescriptor glPixelStorei$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glPixelStorei$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelStorei",
        "(II)V",
        constants$41.glPixelStorei$FUNC, false
    );
    static final FunctionDescriptor glPixelTransferf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glPixelTransferf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelTransferf",
        "(IF)V",
        constants$41.glPixelTransferf$FUNC, false
    );
    static final FunctionDescriptor glPixelTransferi$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glPixelTransferi$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelTransferi",
        "(II)V",
        constants$41.glPixelTransferi$FUNC, false
    );
    static final FunctionDescriptor glPixelMapfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glPixelMapfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelMapfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$41.glPixelMapfv$FUNC, false
    );
    static final FunctionDescriptor glPixelMapuiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glPixelMapuiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelMapuiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$41.glPixelMapuiv$FUNC, false
    );
}


