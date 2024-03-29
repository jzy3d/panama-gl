// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$8 {

    static final FunctionDescriptor XCreateGC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XCreateGC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateGC",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$8.XCreateGC$FUNC, false
    );
    static final FunctionDescriptor XGContextFromGC$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle XGContextFromGC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGContextFromGC",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$8.XGContextFromGC$FUNC, false
    );
    static final FunctionDescriptor XFlushGC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XFlushGC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFlushGC",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$8.XFlushGC$FUNC, false
    );
    static final FunctionDescriptor XCreatePixmap$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle XCreatePixmap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreatePixmap",
        "(Ljdk/incubator/foreign/MemoryAddress;JIII)J",
        constants$8.XCreatePixmap$FUNC, false
    );
    static final FunctionDescriptor XCreateBitmapFromData$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle XCreateBitmapFromData$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreateBitmapFromData",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;II)J",
        constants$8.XCreateBitmapFromData$FUNC, false
    );
    static final FunctionDescriptor XCreatePixmapFromBitmapData$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_INT
    );
    static final MethodHandle XCreatePixmapFromBitmapData$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XCreatePixmapFromBitmapData",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;IIJJI)J",
        constants$8.XCreatePixmapFromBitmapData$FUNC, false
    );
}


