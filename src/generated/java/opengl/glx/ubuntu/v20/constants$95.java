// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$95 {

    static final FunctionDescriptor glMultMatrixd$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glMultMatrixd$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultMatrixd",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$95.glMultMatrixd$FUNC, false
    );
    static final FunctionDescriptor glMultMatrixf$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glMultMatrixf$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultMatrixf",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$95.glMultMatrixf$FUNC, false
    );
    static final FunctionDescriptor glRotated$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRotated$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRotated",
        "(DDDD)V",
        constants$95.glRotated$FUNC, false
    );
    static final FunctionDescriptor glRotatef$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRotatef$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRotatef",
        "(FFFF)V",
        constants$95.glRotatef$FUNC, false
    );
    static final FunctionDescriptor glScaled$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glScaled$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glScaled",
        "(DDD)V",
        constants$95.glScaled$FUNC, false
    );
    static final FunctionDescriptor glScalef$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glScalef$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glScalef",
        "(FFF)V",
        constants$95.glScalef$FUNC, false
    );
}


