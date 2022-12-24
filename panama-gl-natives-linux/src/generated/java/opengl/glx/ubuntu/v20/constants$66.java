// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$66 {

    static final FunctionDescriptor XwcTextPerCharExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XwcTextPerCharExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcTextPerCharExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$66.XwcTextPerCharExtents$FUNC, false
    );
    static final FunctionDescriptor Xutf8TextPerCharExtents$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Xutf8TextPerCharExtents$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "Xutf8TextPerCharExtents",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$66.Xutf8TextPerCharExtents$FUNC, false
    );
    static final FunctionDescriptor XmbDrawText$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XmbDrawText$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbDrawText",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$66.XmbDrawText$FUNC, false
    );
    static final FunctionDescriptor XwcDrawText$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XwcDrawText$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcDrawText",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$66.XwcDrawText$FUNC, false
    );
    static final FunctionDescriptor Xutf8DrawText$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle Xutf8DrawText$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "Xutf8DrawText",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$66.Xutf8DrawText$FUNC, false
    );
    static final FunctionDescriptor XmbDrawString$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XmbDrawString$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbDrawString",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$66.XmbDrawString$FUNC, false
    );
}

