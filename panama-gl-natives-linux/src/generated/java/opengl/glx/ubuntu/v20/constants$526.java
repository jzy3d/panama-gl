// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$526 {

    static final FunctionDescriptor PFNGLRASTERPOS3XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLRASTERPOS3XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$526.PFNGLRASTERPOS3XOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRASTERPOS3XVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLRASTERPOS3XVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$526.PFNGLRASTERPOS3XVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRASTERPOS4XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLRASTERPOS4XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$526.PFNGLRASTERPOS4XOESPROC$FUNC, false
    );
}

