// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$61 {

    static final FunctionDescriptor XWriteBitmapFile$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle XWriteBitmapFile$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XWriteBitmapFile",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JIIII)I",
        constants$61.XWriteBitmapFile$FUNC, false
    );
    static final FunctionDescriptor XSupportsLocale$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle XSupportsLocale$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSupportsLocale",
        "()I",
        constants$61.XSupportsLocale$FUNC, false
    );
    static final FunctionDescriptor XSetLocaleModifiers$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XSetLocaleModifiers$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetLocaleModifiers",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$61.XSetLocaleModifiers$FUNC, false
    );
    static final FunctionDescriptor XOpenOM$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XOpenOM$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XOpenOM",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$61.XOpenOM$FUNC, false
    );
    static final FunctionDescriptor XCloseOM$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XCloseOM$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCloseOM",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$61.XCloseOM$FUNC, false
    );
    static final FunctionDescriptor XSetOMValues$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XSetOMValues$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetOMValues",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$61.XSetOMValues$FUNC, true
    );
}


