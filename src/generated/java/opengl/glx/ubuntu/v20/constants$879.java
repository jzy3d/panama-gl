// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$879 {

    static final FunctionDescriptor PFNGLSTENCILSTROKEPATHNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSTENCILSTROKEPATHNVPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$879.PFNGLSTENCILSTROKEPATHNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTENCILFILLPATHINSTANCEDNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSTENCILFILLPATHINSTANCEDNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$879.PFNGLSTENCILFILLPATHINSTANCEDNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$879.PFNGLSTENCILSTROKEPATHINSTANCEDNVPROC$FUNC, false
    );
}


