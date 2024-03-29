// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$16 {

    static final FunctionDescriptor XDisplayString$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XDisplayString$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayString",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$16.XDisplayString$FUNC, false
    );
    static final FunctionDescriptor XDefaultColormap$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XDefaultColormap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDefaultColormap",
        "(Ljdk/incubator/foreign/MemoryAddress;I)J",
        constants$16.XDefaultColormap$FUNC, false
    );
    static final FunctionDescriptor XDefaultColormapOfScreen$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle XDefaultColormapOfScreen$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDefaultColormapOfScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$16.XDefaultColormapOfScreen$FUNC, false
    );
    static final FunctionDescriptor XDisplayOfScreen$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XDisplayOfScreen$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayOfScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$16.XDisplayOfScreen$FUNC, false
    );
    static final FunctionDescriptor XScreenOfDisplay$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XScreenOfDisplay$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XScreenOfDisplay",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$16.XScreenOfDisplay$FUNC, false
    );
    static final FunctionDescriptor XDefaultScreenOfDisplay$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XDefaultScreenOfDisplay$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDefaultScreenOfDisplay",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$16.XDefaultScreenOfDisplay$FUNC, false
    );
}


