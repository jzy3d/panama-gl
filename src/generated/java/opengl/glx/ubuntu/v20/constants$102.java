// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$102 {

    static final FunctionDescriptor glNormal3b$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glNormal3b$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3b",
        "(BBB)V",
        constants$102.glNormal3b$FUNC, false
    );
    static final FunctionDescriptor glNormal3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glNormal3d$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3d",
        "(DDD)V",
        constants$102.glNormal3d$FUNC, false
    );
    static final FunctionDescriptor glNormal3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glNormal3f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3f",
        "(FFF)V",
        constants$102.glNormal3f$FUNC, false
    );
    static final FunctionDescriptor glNormal3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glNormal3i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3i",
        "(III)V",
        constants$102.glNormal3i$FUNC, false
    );
    static final FunctionDescriptor glNormal3s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glNormal3s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3s",
        "(SSS)V",
        constants$102.glNormal3s$FUNC, false
    );
    static final FunctionDescriptor glNormal3bv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3bv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3bv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$102.glNormal3bv$FUNC, false
    );
}


