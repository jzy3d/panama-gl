// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$218 {

    static final FunctionDescriptor PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$218.PFNGLDRAWTRANSFORMFEEDBACKSTREAMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBEGINQUERYINDEXEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBEGINQUERYINDEXEDPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$218.PFNGLBEGINQUERYINDEXEDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDQUERYINDEXEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLENDQUERYINDEXEDPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$218.PFNGLENDQUERYINDEXEDPROC$FUNC, false
    );
}


