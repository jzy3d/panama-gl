// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$39 {

    static final FunctionDescriptor glLightModelf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glLightModelf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLightModelf",
        "(IF)V",
        constants$39.glLightModelf$FUNC, false
    );
    static final FunctionDescriptor glLightModeli$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glLightModeli$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLightModeli",
        "(II)V",
        constants$39.glLightModeli$FUNC, false
    );
    static final FunctionDescriptor glLightModelfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glLightModelfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLightModelfv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$39.glLightModelfv$FUNC, false
    );
    static final FunctionDescriptor glLightModeliv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glLightModeliv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLightModeliv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$39.glLightModeliv$FUNC, false
    );
    static final FunctionDescriptor glMaterialf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glMaterialf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMaterialf",
        "(IIF)V",
        constants$39.glMaterialf$FUNC, false
    );
    static final FunctionDescriptor glMateriali$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMateriali$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMateriali",
        "(III)V",
        constants$39.glMateriali$FUNC, false
    );
}


