// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$143 {

    static final FunctionDescriptor glWindowPos2sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos2sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glWindowPos2sv$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glWindowPos3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3d",
        "(DDD)V",
        constants$143.glWindowPos3d$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glWindowPos3dv$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glWindowPos3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3f",
        "(FFF)V",
        constants$143.glWindowPos3f$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$143.glWindowPos3fv$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glWindowPos3i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3i",
        "(III)V",
        constants$143.glWindowPos3i$FUNC, false
    );
}


