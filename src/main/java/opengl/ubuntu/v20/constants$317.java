// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$317 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBL1UI64ARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXATTRIBL1UI64ARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IJ)V",
        constants$317.PFNGLVERTEXATTRIBL1UI64ARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL1UI64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBL1UI64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$317.PFNGLVERTEXATTRIBL1UI64VARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBLUI64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBLUI64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$317.PFNGLGETVERTEXATTRIBLUI64VARBPROC$FUNC, false
    );
}


