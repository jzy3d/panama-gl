// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$215 {

    static final FunctionDescriptor PFNGLPATCHPARAMETERIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPATCHPARAMETERIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$215.PFNGLPATCHPARAMETERIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATCHPARAMETERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATCHPARAMETERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$215.PFNGLPATCHPARAMETERFVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDTRANSFORMFEEDBACKPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDTRANSFORMFEEDBACKPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$215.PFNGLBINDTRANSFORMFEEDBACKPROC$FUNC, false
    );
}

