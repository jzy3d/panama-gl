// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$77 {

    static final FunctionDescriptor glMultiTexCoord2sARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord2sARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2sARB",
        "(ISS)V",
        constants$77.glMultiTexCoord2sARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2svARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2svARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$77.glMultiTexCoord2svARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord3dARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3dARB",
        "(IDDD)V",
        constants$77.glMultiTexCoord3dARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3dvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3dvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$77.glMultiTexCoord3dvARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3fARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord3fARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3fARB",
        "(IFFF)V",
        constants$77.glMultiTexCoord3fARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3fvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$77.glMultiTexCoord3fvARB$FUNC, false
    );
}


