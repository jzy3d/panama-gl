// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$905 {

    static final FunctionDescriptor PFNGLMAKEBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMAKEBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$905.PFNGLMAKEBUFFERRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAKEBUFFERNONRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMAKEBUFFERNONRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$905.PFNGLMAKEBUFFERNONRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$905.PFNGLISBUFFERRESIDENTNVPROC$FUNC, false
    );
}


