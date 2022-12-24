// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$134 {

    static final FunctionDescriptor glMultiTexCoord2s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord2s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2s",
        "(ISS)V",
        constants$134.glMultiTexCoord2s$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord2sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$134.glMultiTexCoord2sv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3d",
        "(IDDD)V",
        constants$134.glMultiTexCoord3d$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$134.glMultiTexCoord3dv$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3f",
        "(IFFF)V",
        constants$134.glMultiTexCoord3f$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord3fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$134.glMultiTexCoord3fv$FUNC, false
    );
}

