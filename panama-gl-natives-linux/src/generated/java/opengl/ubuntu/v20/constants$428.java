// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$428 {

    static final FunctionDescriptor PFNGLCONVOLUTIONPARAMETERXVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCONVOLUTIONPARAMETERXVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$428.PFNGLCONVOLUTIONPARAMETERXVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLEVALCOORD1XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLEVALCOORD1XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$428.PFNGLEVALCOORD1XOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLEVALCOORD1XVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLEVALCOORD1XVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$428.PFNGLEVALCOORD1XVOESPROC$FUNC, false
    );
}


