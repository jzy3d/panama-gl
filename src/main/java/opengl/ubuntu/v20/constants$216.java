// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$216 {

    static final FunctionDescriptor PFNGLDELETETRANSFORMFEEDBACKSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETETRANSFORMFEEDBACKSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$216.PFNGLDELETETRANSFORMFEEDBACKSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENTRANSFORMFEEDBACKSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENTRANSFORMFEEDBACKSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$216.PFNGLGENTRANSFORMFEEDBACKSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISTRANSFORMFEEDBACKPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISTRANSFORMFEEDBACKPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$216.PFNGLISTRANSFORMFEEDBACKPROC$FUNC, false
    );
}


