// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$444 {

    static final FunctionDescriptor PFNGLCREATESHADEROBJECTARBPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCREATESHADEROBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$444.PFNGLCREATESHADEROBJECTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSHADERSOURCEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSHADERSOURCEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$444.PFNGLSHADERSOURCEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPILESHADERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLCOMPILESHADERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$444.PFNGLCOMPILESHADERARBPROC$FUNC, false
    );
}


