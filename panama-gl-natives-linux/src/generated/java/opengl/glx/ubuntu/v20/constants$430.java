// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$430 {

    static final FunctionDescriptor PFNGLMATRIXINDEXUSVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMATRIXINDEXUSVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$430.PFNGLMATRIXINDEXUSVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMATRIXINDEXUIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMATRIXINDEXUIVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$430.PFNGLMATRIXINDEXUIVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMATRIXINDEXPOINTERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMATRIXINDEXPOINTERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$430.PFNGLMATRIXINDEXPOINTERARBPROC$FUNC, false
    );
}

