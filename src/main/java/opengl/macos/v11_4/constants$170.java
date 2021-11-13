// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$170 {

    static final FunctionDescriptor gluNurbsProperty$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle gluNurbsProperty$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluNurbsProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;IF)V",
        constants$170.gluNurbsProperty$FUNC, false
    );
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
        constants$170.gluNurbsSurface$FUNC, false
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
        constants$170.gluOrtho2D$FUNC, false
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
        constants$170.gluPartialDisk$FUNC, false
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
        constants$170.gluPerspective$FUNC, false
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
        constants$170.gluPickMatrix$FUNC, false
    );
}


