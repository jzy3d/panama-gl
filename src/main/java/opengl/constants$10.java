// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$10 {

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
        constants$10.glMultiTexCoord4iARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4ivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4ivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4ivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$10.glMultiTexCoord4ivARB$FUNC, false
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
        constants$10.glMultiTexCoord4sARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord4svARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord4svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord4svARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$10.glMultiTexCoord4svARB$FUNC, false
    );
    static final FunctionDescriptor glGenQueriesARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenQueriesARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenQueriesARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$10.glGenQueriesARB$FUNC, false
    );
    static final FunctionDescriptor glDeleteQueriesARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteQueriesARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteQueriesARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$10.glDeleteQueriesARB$FUNC, false
    );
}


