// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$268 {

    static final FunctionDescriptor PFNGLGETBUFFERPARAMETERI64VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERPARAMETERI64VPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$268.PFNGLGETBUFFERPARAMETERI64VPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTUREPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTUREPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$268.PFNGLFRAMEBUFFERTEXTUREPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXIMAGE2DMULTISAMPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLTEXIMAGE2DMULTISAMPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIB)V",
        constants$268.PFNGLTEXIMAGE2DMULTISAMPLEPROC$FUNC, false
    );
}


