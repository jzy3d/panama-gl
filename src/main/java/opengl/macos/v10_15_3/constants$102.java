// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$102 {

    static final FunctionDescriptor glNewList$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glNewList$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNewList",
        "(II)V",
        constants$102.glNewList$FUNC, false
    );
    static final FunctionDescriptor glNormal3b$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glNormal3b$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3b",
        "(BBB)V",
        constants$102.glNormal3b$FUNC, false
    );
    static final FunctionDescriptor glNormal3bv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3bv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3bv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$102.glNormal3bv$FUNC, false
    );
    static final FunctionDescriptor glNormal3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glNormal3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3d",
        "(DDD)V",
        constants$102.glNormal3d$FUNC, false
    );
    static final FunctionDescriptor glNormal3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$102.glNormal3dv$FUNC, false
    );
    static final FunctionDescriptor glNormal3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glNormal3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormal3f",
        "(FFF)V",
        constants$102.glNormal3f$FUNC, false
    );
}


