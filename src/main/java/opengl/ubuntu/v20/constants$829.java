// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$829 {

    static final FunctionDescriptor PFNGLENDTRANSFORMFEEDBACKNVPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLENDTRANSFORMFEEDBACKNVPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$829.PFNGLENDTRANSFORMFEEDBACKNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$829.PFNGLTRANSFORMFEEDBACKATTRIBSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDBUFFERRANGENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLBINDBUFFERRANGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJJ)V",
        constants$829.PFNGLBINDBUFFERRANGENVPROC$FUNC, false
    );
}


