// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$364 {

    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$364.PFNGLNAMEDFRAMEBUFFERTEXTUREPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$364.PFNGLNAMEDFRAMEBUFFERTEXTURELAYERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$364.PFNGLNAMEDFRAMEBUFFERDRAWBUFFERPROC$FUNC, false
    );
}

