// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$936 {

    static final FunctionDescriptor gluNurbsSurface$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle gluNurbsSurface$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluNurbsSurface",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;III)V",
        constants$936.gluNurbsSurface$FUNC, false
    );
    static final FunctionDescriptor gluOrtho2D$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle gluOrtho2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluOrtho2D",
        "(DDDD)V",
        constants$936.gluOrtho2D$FUNC, false
    );
    static final FunctionDescriptor gluPartialDisk$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle gluPartialDisk$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluPartialDisk",
        "(Ljdk/incubator/foreign/MemoryAddress;DDIIDD)V",
        constants$936.gluPartialDisk$FUNC, false
    );
    static final FunctionDescriptor gluPerspective$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle gluPerspective$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluPerspective",
        "(DDDD)V",
        constants$936.gluPerspective$FUNC, false
    );
    static final FunctionDescriptor gluPickMatrix$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle gluPickMatrix$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluPickMatrix",
        "(DDDDLjdk/incubator/foreign/MemoryAddress;)V",
        constants$936.gluPickMatrix$FUNC, false
    );
    static final FunctionDescriptor gluProject$FUNC = FunctionDescriptor.of(C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gluProject$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluProject",
        "(DDDLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$936.gluProject$FUNC, false
    );
}

