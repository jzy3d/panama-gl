// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$36 {

    static final FunctionDescriptor XFreeFontPath$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XFreeFontPath$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFreeFontPath",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$36.XFreeFontPath$FUNC, false
    );
    static final FunctionDescriptor XFreeGC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XFreeGC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFreeGC",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$36.XFreeGC$FUNC, false
    );
    static final FunctionDescriptor XFreeModifiermap$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XFreeModifiermap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFreeModifiermap",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$36.XFreeModifiermap$FUNC, false
    );
    static final FunctionDescriptor XFreePixmap$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle XFreePixmap$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFreePixmap",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$36.XFreePixmap$FUNC, false
    );
    static final FunctionDescriptor XGeometry$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XGeometry$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGeometry",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$36.XGeometry$FUNC, false
    );
    static final FunctionDescriptor XGetErrorDatabaseText$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XGetErrorDatabaseText$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XGetErrorDatabaseText",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$36.XGetErrorDatabaseText$FUNC, false
    );
}


