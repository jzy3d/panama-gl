// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$162 {

    static final FunctionDescriptor glMultiTexCoord2iARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMultiTexCoord2iARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2iARB",
        "(III)V",
        constants$162.glMultiTexCoord2iARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2ivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2ivARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2ivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$162.glMultiTexCoord2ivARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2sARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord2sARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2sARB",
        "(ISS)V",
        constants$162.glMultiTexCoord2sARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord2svARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord2svARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord2svARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$162.glMultiTexCoord2svARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord3dARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3dARB",
        "(IDDD)V",
        constants$162.glMultiTexCoord3dARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord3dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord3dvARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glMultiTexCoord3dvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$162.glMultiTexCoord3dvARB$FUNC, false
    );
}


