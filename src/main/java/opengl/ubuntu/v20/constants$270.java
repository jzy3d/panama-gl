// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$270 {

    static final FunctionDescriptor PFNGLBINDVERTEXBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDVERTEXBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$270.PFNGLBINDVERTEXBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLIPCONTROLPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCLIPCONTROLPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$270.PFNGLCLIPCONTROLPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATETRANSFORMFEEDBACKSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATETRANSFORMFEEDBACKSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$270.PFNGLCREATETRANSFORMFEEDBACKSPROC$FUNC, false
    );
}

