// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$256 {

    static final FunctionDescriptor PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$256.PFNGLGETFRAMEBUFFERATTACHMENTPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENERATEMIPMAPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLGENERATEMIPMAPPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$256.PFNGLGENERATEMIPMAPPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLITFRAMEBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLITFRAMEBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIII)V",
        constants$256.PFNGLBLITFRAMEBUFFERPROC$FUNC, false
    );
}


