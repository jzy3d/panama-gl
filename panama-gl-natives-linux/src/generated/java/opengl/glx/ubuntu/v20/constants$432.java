// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$432 {

    static final FunctionDescriptor PFNGLISQUERYARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISQUERYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$432.PFNGLISQUERYARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBEGINQUERYARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBEGINQUERYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$432.PFNGLBEGINQUERYARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDQUERYARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENDQUERYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$432.PFNGLENDQUERYARBPROC$FUNC, false
    );
}


