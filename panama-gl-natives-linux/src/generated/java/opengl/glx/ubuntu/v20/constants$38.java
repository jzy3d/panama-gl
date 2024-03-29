// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$38 {

    static final FunctionDescriptor XGetKeyboardControl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetKeyboardControl$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetKeyboardControl",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$38.XGetKeyboardControl$FUNC, false
    );
    static final FunctionDescriptor XGetPointerControl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetPointerControl$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetPointerControl",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$38.XGetPointerControl$FUNC, false
    );
    static final FunctionDescriptor XGetPointerMapping$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XGetPointerMapping$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetPointerMapping",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$38.XGetPointerMapping$FUNC, false
    );
    static final FunctionDescriptor XGetScreenSaver$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetScreenSaver$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetScreenSaver",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$38.XGetScreenSaver$FUNC, false
    );
    static final FunctionDescriptor XGetTransientForHint$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XGetTransientForHint$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetTransientForHint",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$38.XGetTransientForHint$FUNC, false
    );
    static final FunctionDescriptor XGetWindowProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGetWindowProperty$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetWindowProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;JJJJIJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$38.XGetWindowProperty$FUNC, false
    );
}


