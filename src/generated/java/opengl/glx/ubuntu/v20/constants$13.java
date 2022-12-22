// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$13 {

    static final FunctionDescriptor XAddExtension$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XAddExtension$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XAddExtension",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$13.XAddExtension$FUNC, false
    );
    static final FunctionDescriptor XFindOnExtensionList$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XFindOnExtensionList$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFindOnExtensionList",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$13.XFindOnExtensionList$FUNC, false
    );
    static final FunctionDescriptor XEHeadOfExtensionList$FUNC = FunctionDescriptor.of(C_POINTER,
        MemoryLayout.unionLayout(
            C_POINTER.withName("display"),
            C_POINTER.withName("gc"),
            C_POINTER.withName("visual"),
            C_POINTER.withName("screen"),
            C_POINTER.withName("pixmap_format"),
            C_POINTER.withName("font")
        )
    );
    static final MethodHandle XEHeadOfExtensionList$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XEHeadOfExtensionList",
        "(Ljdk/incubator/foreign/MemorySegment;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$13.XEHeadOfExtensionList$FUNC, false
    );
    static final FunctionDescriptor XRootWindow$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XRootWindow$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XRootWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;I)J",
        constants$13.XRootWindow$FUNC, false
    );
    static final FunctionDescriptor XDefaultRootWindow$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle XDefaultRootWindow$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDefaultRootWindow",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$13.XDefaultRootWindow$FUNC, false
    );
    static final FunctionDescriptor XRootWindowOfScreen$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle XRootWindowOfScreen$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XRootWindowOfScreen",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$13.XRootWindowOfScreen$FUNC, false
    );
}


