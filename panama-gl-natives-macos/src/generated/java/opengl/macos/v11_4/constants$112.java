// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$112 {

    static final FunctionDescriptor glReadPixels$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glReadPixels$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glReadPixels",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$112.glReadPixels$FUNC, false
    );
    static final FunctionDescriptor glRectd$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRectd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectd",
        "(DDDD)V",
        constants$112.glRectd$FUNC, false
    );
    static final FunctionDescriptor glRectdv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectdv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectdv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$112.glRectdv$FUNC, false
    );
    static final FunctionDescriptor glRectf$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRectf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectf",
        "(FFFF)V",
        constants$112.glRectf$FUNC, false
    );
    static final FunctionDescriptor glRectfv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectfv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$112.glRectfv$FUNC, false
    );
    static final FunctionDescriptor glRecti$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRecti$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRecti",
        "(IIII)V",
        constants$112.glRecti$FUNC, false
    );
}


