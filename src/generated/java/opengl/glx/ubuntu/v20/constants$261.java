// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$261 {

    static final FunctionDescriptor PFNGLCOPYBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLCOPYBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJJ)V",
        constants$261.PFNGLCOPYBUFFERSUBDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETUNIFORMINDICESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNIFORMINDICESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$261.PFNGLGETUNIFORMINDICESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETACTIVEUNIFORMSIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETACTIVEUNIFORMSIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$261.PFNGLGETACTIVEUNIFORMSIVPROC$FUNC, false
    );
}


