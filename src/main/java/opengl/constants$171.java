// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$171 {

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
        constants$171.gluProject$FUNC, false
    );
    static final FunctionDescriptor gluPwlCurve$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle gluPwlCurve$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluPwlCurve",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)V",
        constants$171.gluPwlCurve$FUNC, false
    );
    static final FunctionDescriptor gluQuadricCallback$CallBackFunc$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gluQuadricCallback$CallBackFunc$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$171.gluQuadricCallback$CallBackFunc$FUNC, false
    );
    static final FunctionDescriptor gluQuadricCallback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluQuadricCallback$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricCallback",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$171.gluQuadricCallback$FUNC, false
    );
    static final FunctionDescriptor gluQuadricDrawStyle$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle gluQuadricDrawStyle$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricDrawStyle",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$171.gluQuadricDrawStyle$FUNC, false
    );
}


