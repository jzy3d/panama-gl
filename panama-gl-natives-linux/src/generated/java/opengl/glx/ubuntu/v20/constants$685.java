// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$685 {

    static final FunctionDescriptor PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJJ)V",
        constants$685.PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$685.PFNGLNAMEDFRAMEBUFFERTEXTUREEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$685.PFNGLNAMEDFRAMEBUFFERTEXTURELAYEREXTPROC$FUNC, false
    );
}


