// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$667 {

    static final FunctionDescriptor PFNGLTEXIMAGE3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle PFNGLTEXIMAGE3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$667.PFNGLTEXIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXSUBIMAGE3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle PFNGLTEXSUBIMAGE3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$667.PFNGLTEXSUBIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$667.PFNGLFRAMEBUFFERTEXTURELAYEREXTPROC$FUNC, false
    );
}


