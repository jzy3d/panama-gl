// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$50 {

    static final FunctionDescriptor XRotateWindowProperties$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle XRotateWindowProperties$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XRotateWindowProperties",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;II)I",
        constants$50.XRotateWindowProperties$FUNC, false
    );
    static final FunctionDescriptor XScreenCount$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle XScreenCount$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XScreenCount",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$50.XScreenCount$FUNC, false
    );
    static final FunctionDescriptor XSelectInput$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle XSelectInput$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSelectInput",
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)I",
        constants$50.XSelectInput$FUNC, false
    );
    static final FunctionDescriptor XSendEvent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle XSendEvent$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSendEvent",
        "(Ljdk/incubator/foreign/MemoryAddress;JIJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$50.XSendEvent$FUNC, false
    );
    static final FunctionDescriptor XSetAccessControl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XSetAccessControl$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetAccessControl",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$50.XSetAccessControl$FUNC, false
    );
    static final FunctionDescriptor XSetArcMode$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle XSetArcMode$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetArcMode",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$50.XSetArcMode$FUNC, false
    );
}


