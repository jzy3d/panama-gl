// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1012 {

    static final FunctionDescriptor PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFFF)V",
        constants$1012.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1012.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FVSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFFFFFF)V",
        constants$1012.PFNGLREPLACEMENTCODEUITEXCOORD2FNORMAL3FVERTEX3FSUNPROC$FUNC, false
    );
}


