// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$832 {

    static final FunctionDescriptor PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$832.PFNGLGETTRANSFORMFEEDBACKVARYINGNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$832.PFNGLTRANSFORMFEEDBACKSTREAMATTRIBSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDTRANSFORMFEEDBACKNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDTRANSFORMFEEDBACKNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$832.PFNGLBINDTRANSFORMFEEDBACKNVPROC$FUNC, false
    );
}


