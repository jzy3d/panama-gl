// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$538 {

    static final FunctionDescriptor PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$538.PFNGLBLENDFUNCSEPARATEINDEXEDAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDEQUATIONINDEXEDAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLENDEQUATIONINDEXEDAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$538.PFNGLBLENDEQUATIONINDEXEDAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$538.PFNGLBLENDEQUATIONSEPARATEINDEXEDAMDPROC$FUNC, false
    );
}


