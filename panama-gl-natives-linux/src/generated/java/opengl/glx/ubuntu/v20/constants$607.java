// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$607 {

    static final FunctionDescriptor PFNGLCONVOLUTIONPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCONVOLUTIONPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$607.PFNGLCONVOLUTIONPARAMETERIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$607.PFNGLCOPYCONVOLUTIONFILTER1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$607.PFNGLCOPYCONVOLUTIONFILTER2DEXTPROC$FUNC, false
    );
}


