// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$375 {

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
        constants$375.PFNGLCOMPRESSEDTEXIMAGE1DARBPROC$FUNC, false
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
        constants$375.PFNGLCOMPRESSEDTEXSUBIMAGE3DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$375.PFNGLCOMPRESSEDTEXSUBIMAGE2DARBPROC$FUNC, false
    );
}


