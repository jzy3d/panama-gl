// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$665 {

    static final FunctionDescriptor PFNGLBINDIMAGETEXTUREEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDIMAGETEXTUREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBIII)V",
        constants$665.PFNGLBINDIMAGETEXTUREEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMEMORYBARRIEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLMEMORYBARRIEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$665.PFNGLMEMORYBARRIEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTENCILCLEARTAGEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSTENCILCLEARTAGEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$665.PFNGLSTENCILCLEARTAGEXTPROC$FUNC, false
    );
}

