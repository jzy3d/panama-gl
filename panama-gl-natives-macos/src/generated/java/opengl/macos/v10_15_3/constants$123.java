// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$123 {

    static final FunctionDescriptor glTexImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexImage1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexImage1D",
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$123.glTexImage1D$FUNC, false
    );
    static final FunctionDescriptor glTexImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexImage2D",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$123.glTexImage2D$FUNC, false
    );
    static final FunctionDescriptor glTexImage3D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexImage3D",
        "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$123.glTexImage3D$FUNC, false
    );
    static final FunctionDescriptor glTexParameterf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glTexParameterf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameterf",
        "(IIF)V",
        constants$123.glTexParameterf$FUNC, false
    );
    static final FunctionDescriptor glTexParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexParameterfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameterfv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$123.glTexParameterfv$FUNC, false
    );
    static final FunctionDescriptor glTexParameteri$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glTexParameteri$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexParameteri",
        "(III)V",
        constants$123.glTexParameteri$FUNC, false
    );
}


