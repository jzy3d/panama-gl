// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$906 {

    static final FunctionDescriptor PFNGLMAKENAMEDBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMAKENAMEDBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$906.PFNGLMAKENAMEDBUFFERRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$906.PFNGLMAKENAMEDBUFFERNONRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISNAMEDBUFFERRESIDENTNVPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISNAMEDBUFFERRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$906.PFNGLISNAMEDBUFFERRESIDENTNVPROC$FUNC, false
    );
}


