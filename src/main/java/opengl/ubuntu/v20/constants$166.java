// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$166 {

    static final FunctionDescriptor PFNGLBINDRENDERBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDRENDERBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$166.PFNGLBINDRENDERBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETERENDERBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETERENDERBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$166.PFNGLDELETERENDERBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENRENDERBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENRENDERBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$166.PFNGLGENRENDERBUFFERSPROC$FUNC, false
    );
}


