// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$471 {

    static final FunctionDescriptor PFNGLGENPERFMONITORSAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENPERFMONITORSAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$471.PFNGLGENPERFMONITORSAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPERFMONITORSAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEPERFMONITORSAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$471.PFNGLDELETEPERFMONITORSAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IBIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$471.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC, false
    );
}

