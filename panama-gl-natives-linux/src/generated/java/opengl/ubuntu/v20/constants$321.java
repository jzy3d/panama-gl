// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$321 {

    static final FunctionDescriptor PFNGLBLENDEQUATIONIARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLENDEQUATIONIARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$321.PFNGLBLENDEQUATIONIARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDEQUATIONSEPARATEIARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLENDEQUATIONSEPARATEIARBPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$321.PFNGLBLENDEQUATIONSEPARATEIARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDFUNCIARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLENDFUNCIARBPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$321.PFNGLBLENDFUNCIARBPROC$FUNC, false
    );
}

