// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$94 {

    static final FunctionDescriptor glIndexPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glIndexPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexPointer",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$94.glIndexPointer$FUNC, false
    );
    static final FunctionDescriptor glIndexd$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glIndexd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexd",
        "(D)V",
        constants$94.glIndexd$FUNC, false
    );
    static final FunctionDescriptor glIndexdv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glIndexdv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexdv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$94.glIndexdv$FUNC, false
    );
    static final FunctionDescriptor glIndexf$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glIndexf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexf",
        "(F)V",
        constants$94.glIndexf$FUNC, false
    );
    static final FunctionDescriptor glIndexfv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glIndexfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexfv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$94.glIndexfv$FUNC, false
    );
    static final FunctionDescriptor glIndexi$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glIndexi$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexi",
        "(I)V",
        constants$94.glIndexi$FUNC, false
    );
}


