// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$771 {

    static final FunctionDescriptor PFNGLEXTRACTCOMPONENTEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLEXTRACTCOMPONENTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$771.PFNGLEXTRACTCOMPONENTEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENSYMBOLSEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGENSYMBOLSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)I",
        constants$771.PFNGLGENSYMBOLSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSETINVARIANTEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSETINVARIANTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$771.PFNGLSETINVARIANTEXTPROC$FUNC, false
    );
}


