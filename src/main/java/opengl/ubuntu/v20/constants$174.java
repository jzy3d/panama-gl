// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$174 {

    static final FunctionDescriptor PFNGLISVERTEXARRAYPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISVERTEXARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$174.PFNGLISVERTEXARRAYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWARRAYSINSTANCEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWARRAYSINSTANCEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$174.PFNGLDRAWARRAYSINSTANCEDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWELEMENTSINSTANCEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWELEMENTSINSTANCEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$174.PFNGLDRAWELEMENTSINSTANCEDPROC$FUNC, false
    );
}


