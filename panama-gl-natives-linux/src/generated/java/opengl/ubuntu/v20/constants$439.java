// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$439 {

    static final FunctionDescriptor PFNGLPIXELTRANSFERXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPIXELTRANSFERXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$439.PFNGLPIXELTRANSFERXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPIXELZOOMXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPIXELZOOMXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$439.PFNGLPIXELZOOMXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPRIORITIZETEXTURESXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLPRIORITIZETEXTURESXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$439.PFNGLPRIORITIZETEXTURESXOESPROC$FUNC, false
    );
}


