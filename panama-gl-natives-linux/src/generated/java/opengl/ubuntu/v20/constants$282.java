// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$282 {

    static final FunctionDescriptor PFNGLCLEARNAMEDFRAMEBUFFERFIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_FLOAT,
        C_INT
    );
    static final MethodHandle PFNGLCLEARNAMEDFRAMEBUFFERFIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIFI)V",
        constants$282.PFNGLCLEARNAMEDFRAMEBUFFERFIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLITNAMEDFRAMEBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLITNAMEDFRAMEBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIII)V",
        constants$282.PFNGLBLITNAMEDFRAMEBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$MH = RuntimeHelper.downcallHandle(
        "(II)I",
        constants$282.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$FUNC, false
    );
}


