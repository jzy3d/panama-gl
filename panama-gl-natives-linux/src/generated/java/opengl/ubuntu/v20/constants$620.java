// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$620 {

    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIJ)V",
        constants$620.PFNGLVERTEXARRAYVERTEXATTRIBLOFFSETEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREPAGECOMMITMENTEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLTEXTUREPAGECOMMITMENTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIB)V",
        constants$620.PFNGLTEXTUREPAGECOMMITMENTEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$620.PFNGLVERTEXARRAYVERTEXATTRIBDIVISOREXTPROC$FUNC, false
    );
}


