// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$71 {

    static final FunctionDescriptor glColor3fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$71.glColor3fv$FUNC, false
    );
    static final FunctionDescriptor glColor3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glColor3i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3i",
        "(III)V",
        constants$71.glColor3i$FUNC, false
    );
    static final FunctionDescriptor glColor3iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor3iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$71.glColor3iv$FUNC, false
    );
    static final FunctionDescriptor glColor3s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glColor3s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3s",
        "(SSS)V",
        constants$71.glColor3s$FUNC, false
    );
    static final FunctionDescriptor glColor3sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor3sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$71.glColor3sv$FUNC, false
    );
    static final FunctionDescriptor glColor3ub$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glColor3ub$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor3ub",
        "(BBB)V",
        constants$71.glColor3ub$FUNC, false
    );
}


