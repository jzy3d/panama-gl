// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$650 {

    static final FunctionDescriptor PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$650.PFNGLCOMPRESSEDTEXTUREIMAGE1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
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
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$650.PFNGLCOMPRESSEDTEXTURESUBIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$650.PFNGLCOMPRESSEDTEXTURESUBIMAGE2DEXTPROC$FUNC, false
    );
}


