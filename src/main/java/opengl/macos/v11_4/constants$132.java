// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$132 {

    static final FunctionDescriptor glMultiTexCoord1f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1f",
        "(IF)V",
        constants$132.glMultiTexCoord1f$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord1fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$132.glMultiTexCoord1fv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glMultiTexCoord1i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1i",
        "(II)V",
        constants$132.glMultiTexCoord1i$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1iv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord1iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1iv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$132.glMultiTexCoord1iv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord1s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1s",
        "(IS)V",
        constants$132.glMultiTexCoord1s$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord1sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$132.glMultiTexCoord1sv$FUNC, false
    );
}


