// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$74 {

    static final FunctionDescriptor glColor4iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$74.glColor4iv$FUNC, false
    );
    static final FunctionDescriptor glColor4s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glColor4s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4s",
        "(SSSS)V",
        constants$74.glColor4s$FUNC, false
    );
    static final FunctionDescriptor glColor4sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$74.glColor4sv$FUNC, false
    );
    static final FunctionDescriptor glColor4ub$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glColor4ub$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4ub",
        "(BBBB)V",
        constants$74.glColor4ub$FUNC, false
    );
    static final FunctionDescriptor glColor4ubv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4ubv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4ubv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$74.glColor4ubv$FUNC, false
    );
    static final FunctionDescriptor glColor4ui$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glColor4ui$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4ui",
        "(IIII)V",
        constants$74.glColor4ui$FUNC, false
    );
}


