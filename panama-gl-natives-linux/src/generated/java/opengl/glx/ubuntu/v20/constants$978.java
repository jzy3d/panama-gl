// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$978 {

    static final FunctionDescriptor PFNGLFLUSHRASTERSGIXPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLFLUSHRASTERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$978.PFNGLFLUSHRASTERSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAGMENTCOLORMATERIALSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAGMENTCOLORMATERIALSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$978.PFNGLFRAGMENTCOLORMATERIALSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAGMENTLIGHTFSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLFRAGMENTLIGHTFSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$978.PFNGLFRAGMENTLIGHTFSGIXPROC$FUNC, false
    );
}


