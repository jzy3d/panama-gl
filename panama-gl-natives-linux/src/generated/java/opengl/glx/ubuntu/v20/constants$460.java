// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$460 {

    static final FunctionDescriptor PFNGLCOMPRESSEDTEXIMAGE2DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXIMAGE2DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$460.PFNGLCOMPRESSEDTEXIMAGE2DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$460.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$460.PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC$FUNC, false
    );
}


