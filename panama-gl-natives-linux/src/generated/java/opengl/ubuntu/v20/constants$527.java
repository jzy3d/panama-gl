// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$527 {

    static final FunctionDescriptor PFNGLTANGENT3SEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLTANGENT3SEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$527.PFNGLTANGENT3SEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3SVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLTANGENT3SVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$527.PFNGLTANGENT3SVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3BEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLBINORMAL3BEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$527.PFNGLBINORMAL3BEXTPROC$FUNC, false
    );
}


