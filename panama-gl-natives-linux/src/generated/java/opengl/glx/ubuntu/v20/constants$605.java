// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$605 {

    static final FunctionDescriptor PFNGLUNLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLUNLOCKARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$605.PFNGLUNLOCKARRAYSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCONVOLUTIONFILTER1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCONVOLUTIONFILTER1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$605.PFNGLCONVOLUTIONFILTER1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCONVOLUTIONFILTER2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCONVOLUTIONFILTER2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$605.PFNGLCONVOLUTIONFILTER2DEXTPROC$FUNC, false
    );
}

