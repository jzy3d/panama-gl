// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$917 {

    static final FunctionDescriptor PFNGLCOLOR3FVERTEX3FVSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLCOLOR3FVERTEX3FVSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$917.PFNGLCOLOR3FVERTEX3FVSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNORMAL3FVERTEX3FSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLNORMAL3FVERTEX3FSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFFFF)V",
        constants$917.PFNGLNORMAL3FVERTEX3FSUNPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNORMAL3FVERTEX3FVSUNPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLNORMAL3FVERTEX3FVSUNPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$917.PFNGLNORMAL3FVERTEX3FVSUNPROC$FUNC, false
    );
}


