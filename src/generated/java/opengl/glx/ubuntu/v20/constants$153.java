// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$153 {

    static final FunctionDescriptor glMultiTexCoord2sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2sv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glMultiTexCoord2sv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord3d$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3d",
        "(IDDD)V",
        constants$153.glMultiTexCoord3d$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3dv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glMultiTexCoord3dv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord3f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3f",
        "(IFFF)V",
        constants$153.glMultiTexCoord3f$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3fv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glMultiTexCoord3fv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMultiTexCoord3i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3i",
        "(IIII)V",
        constants$153.glMultiTexCoord3i$FUNC, false
    );
}


