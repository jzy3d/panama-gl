// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$818 {

    static final FunctionDescriptor PFNGLISSTATENVPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISSTATENVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$818.PFNGLISSTATENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTATECAPTURENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSTATECAPTURENVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$818.PFNGLSTATECAPTURENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMMANDHEADERNVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGETCOMMANDHEADERNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)I",
        constants$818.PFNGLGETCOMMANDHEADERNVPROC$FUNC, false
    );
}


