// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$79 {

    static final FunctionDescriptor glMultiTexCoord4fARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMultiTexCoord4fARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4fARB",
        "(IFFFF)V",
        constants$79.glMultiTexCoord4fARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4fvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$79.glMultiTexCoord4fvARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4iARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMultiTexCoord4iARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4iARB",
        "(IIIII)V",
        constants$79.glMultiTexCoord4iARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4ivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4ivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4ivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$79.glMultiTexCoord4ivARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4sARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glMultiTexCoord4sARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4sARB",
        "(ISSSS)V",
        constants$79.glMultiTexCoord4sARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4svARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4svARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$79.glMultiTexCoord4svARB$FUNC, false
    );
}


