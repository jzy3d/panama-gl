// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$66 {

    static final FunctionDescriptor glMultiTexCoord1iv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord1iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1iv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$66.glMultiTexCoord1iv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord1s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1s",
        "(IS)V",
        constants$66.glMultiTexCoord1s$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord1sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$66.glMultiTexCoord1sv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2d",
        "(IDD)V",
        constants$66.glMultiTexCoord2d$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$66.glMultiTexCoord2dv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2f",
        "(IFF)V",
        constants$66.glMultiTexCoord2f$FUNC, false
    );
}


