// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$672 {

    static final FunctionDescriptor PFNGLPRIORITIZETEXTURESEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLPRIORITIZETEXTURESEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$672.PFNGLPRIORITIZETEXTURESEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTURENORMALEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLTEXTURENORMALEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$672.PFNGLTEXTURENORMALEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETQUERYOBJECTI64VEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETQUERYOBJECTI64VEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$672.PFNGLGETQUERYOBJECTI64VEXTPROC$FUNC, false
    );
}


