// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$33 {

    static final FunctionDescriptor XEnableAccessControl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XEnableAccessControl$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XEnableAccessControl",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$33.XEnableAccessControl$FUNC, false
    );
    static final FunctionDescriptor XEventsQueued$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XEventsQueued$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XEventsQueued",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$33.XEventsQueued$FUNC, false
    );
    static final FunctionDescriptor XFetchName$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XFetchName$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFetchName",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$33.XFetchName$FUNC, false
    );
    static final FunctionDescriptor XFillArc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle XFillArc$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFillArc",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;IIIIII)I",
        constants$33.XFillArc$FUNC, false
    );
    static final FunctionDescriptor XFillArcs$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XFillArcs$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFillArcs",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$33.XFillArcs$FUNC, false
    );
    static final FunctionDescriptor XFillPolygon$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle XFillPolygon$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XFillPolygon",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$33.XFillPolygon$FUNC, false
    );
}


