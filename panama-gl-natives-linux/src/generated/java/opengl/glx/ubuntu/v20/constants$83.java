// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$83 {

    static final FunctionDescriptor XStringListToTextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle XStringListToTextProperty$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XStringListToTextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$83.XStringListToTextProperty$FUNC, false
    );
    static final FunctionDescriptor XSubtractRegion$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XSubtractRegion$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSubtractRegion",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$83.XSubtractRegion$FUNC, false
    );
    static final FunctionDescriptor XmbTextListToTextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle XmbTextListToTextProperty$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbTextListToTextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$83.XmbTextListToTextProperty$FUNC, false
    );
    static final FunctionDescriptor XwcTextListToTextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle XwcTextListToTextProperty$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcTextListToTextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$83.XwcTextListToTextProperty$FUNC, false
    );
    static final FunctionDescriptor Xutf8TextListToTextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle Xutf8TextListToTextProperty$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "Xutf8TextListToTextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$83.Xutf8TextListToTextProperty$FUNC, false
    );
    static final FunctionDescriptor XwcFreeStringList$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XwcFreeStringList$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcFreeStringList",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$83.XwcFreeStringList$FUNC, false
    );
}


