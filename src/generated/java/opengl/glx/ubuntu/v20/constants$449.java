// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$449 {

    static final FunctionDescriptor PFNGLUNIFORM4IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM4IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$449.PFNGLUNIFORM4IARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$449.PFNGLUNIFORM1FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM2FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$449.PFNGLUNIFORM2FVARBPROC$FUNC, false
    );
}


