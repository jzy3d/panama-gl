// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$850 {

    static final FunctionDescriptor PFNGLBINDPROGRAMNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDPROGRAMNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$850.PFNGLBINDPROGRAMNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPROGRAMSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEPROGRAMSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$850.PFNGLDELETEPROGRAMSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLEXECUTEPROGRAMNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLEXECUTEPROGRAMNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$850.PFNGLEXECUTEPROGRAMNVPROC$FUNC, false
    );
}


