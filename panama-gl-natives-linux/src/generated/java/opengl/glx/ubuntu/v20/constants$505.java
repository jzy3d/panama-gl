// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$505 {

    static final FunctionDescriptor PFNGLLOADMATRIXXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLLOADMATRIXXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$505.PFNGLLOADMATRIXXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMATERIALXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMATERIALXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$505.PFNGLMATERIALXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMATERIALXVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMATERIALXVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$505.PFNGLMATERIALXVOESPROC$FUNC, false
    );
}


