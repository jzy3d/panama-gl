// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$121 {

    static final FunctionDescriptor glRectiv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectiv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRectiv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$121.glRectiv$FUNC, false
    );
    static final FunctionDescriptor glRectsv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectsv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRectsv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$121.glRectsv$FUNC, false
    );
    static final FunctionDescriptor glVertexPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexPointer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glVertexPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$121.glVertexPointer$FUNC, false
    );
    static final FunctionDescriptor glNormalPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glNormalPointer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormalPointer",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$121.glNormalPointer$FUNC, false
    );
    static final FunctionDescriptor glColorPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorPointer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColorPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$121.glColorPointer$FUNC, false
    );
    static final FunctionDescriptor glIndexPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glIndexPointer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glIndexPointer",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$121.glIndexPointer$FUNC, false
    );
}


