// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$59 {

    static final FunctionDescriptor glElementPointerAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glElementPointerAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glElementPointerAPPLE",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$59.glElementPointerAPPLE$FUNC, false
    );
    static final FunctionDescriptor glDrawElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glDrawElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawElementArrayAPPLE",
        "(III)V",
        constants$59.glDrawElementArrayAPPLE$FUNC, false
    );
    static final FunctionDescriptor glDrawRangeElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glDrawRangeElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawRangeElementArrayAPPLE",
        "(IIIII)V",
        constants$59.glDrawRangeElementArrayAPPLE$FUNC, false
    );
    static final FunctionDescriptor glMultiDrawElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glMultiDrawElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiDrawElementArrayAPPLE",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$59.glMultiDrawElementArrayAPPLE$FUNC, false
    );
    static final FunctionDescriptor glMultiDrawRangeElementArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glMultiDrawRangeElementArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiDrawRangeElementArrayAPPLE",
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$59.glMultiDrawRangeElementArrayAPPLE$FUNC, false
    );
    static final FunctionDescriptor glGenFencesAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenFencesAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenFencesAPPLE",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$59.glGenFencesAPPLE$FUNC, false
    );
}


