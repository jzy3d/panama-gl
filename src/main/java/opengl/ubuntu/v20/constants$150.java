// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$150 {

    static final FunctionDescriptor PFNGLGETTRANSFORMFEEDBACKVARYINGPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTRANSFORMFEEDBACKVARYINGPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$150.PFNGLGETTRANSFORMFEEDBACKVARYINGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLAMPCOLORPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCLAMPCOLORPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$150.PFNGLCLAMPCOLORPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBEGINCONDITIONALRENDERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBEGINCONDITIONALRENDERPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$150.PFNGLBEGINCONDITIONALRENDERPROC$FUNC, false
    );
}


