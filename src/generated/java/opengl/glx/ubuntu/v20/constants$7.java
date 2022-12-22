// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$7 {

    static final FunctionDescriptor XCopyColormapAndFree$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XCopyColormapAndFree$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCopyColormapAndFree",
        "(Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$7.XCopyColormapAndFree$FUNC, false
    );
    static final FunctionDescriptor XCreateColormap$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XCreateColormap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateColormap",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;I)J",
        constants$7.XCreateColormap$FUNC, false
    );
    static final FunctionDescriptor XCreatePixmapCursor$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle XCreatePixmapCursor$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreatePixmapCursor",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)J",
        constants$7.XCreatePixmapCursor$FUNC, false
    );
    static final FunctionDescriptor XCreateGlyphCursor$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XCreateGlyphCursor$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateGlyphCursor",
        "(Ljdk/incubator/foreign/MemoryAddress;JJIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$7.XCreateGlyphCursor$FUNC, false
    );
    static final FunctionDescriptor XCreateFontCursor$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XCreateFontCursor$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateFontCursor",
        "(Ljdk/incubator/foreign/MemoryAddress;I)J",
        constants$7.XCreateFontCursor$FUNC, false
    );
    static final FunctionDescriptor XLoadFont$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XLoadFont$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XLoadFont",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$7.XLoadFont$FUNC, false
    );
}


