// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$60 {

    static final FunctionDescriptor XUnmapWindow$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XUnmapWindow$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XUnmapWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$60.XUnmapWindow$FUNC, false
    );
    static final FunctionDescriptor XVendorRelease$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XVendorRelease$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XVendorRelease",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$60.XVendorRelease$FUNC, false
    );
    static final FunctionDescriptor XWarpPointer$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle XWarpPointer$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XWarpPointer",
        "(Ljdk/incubator/foreign/MemoryAddress;JJIIIIII)I",
        constants$60.XWarpPointer$FUNC, false
    );
    static final FunctionDescriptor XWidthMMOfScreen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XWidthMMOfScreen$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XWidthMMOfScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$60.XWidthMMOfScreen$FUNC, false
    );
    static final FunctionDescriptor XWidthOfScreen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XWidthOfScreen$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XWidthOfScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$60.XWidthOfScreen$FUNC, false
    );
    static final FunctionDescriptor XWindowEvent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XWindowEvent$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XWindowEvent",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$60.XWindowEvent$FUNC, false
    );
}


