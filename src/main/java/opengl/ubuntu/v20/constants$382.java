// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$382 {

    static final FunctionDescriptor PFNGLGENBUFFERSARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENBUFFERSARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$382.PFNGLGENBUFFERSARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISBUFFERARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$382.PFNGLISBUFFERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBUFFERDATAARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLBUFFERDATAARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$382.PFNGLBUFFERDATAARBPROC$FUNC, false
    );
}

