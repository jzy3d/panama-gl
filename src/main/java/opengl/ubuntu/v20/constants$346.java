// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$346 {

    static final FunctionDescriptor PFNGLGENQUERIESARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENQUERIESARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$346.PFNGLGENQUERIESARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEQUERIESARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEQUERIESARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$346.PFNGLDELETEQUERIESARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISQUERYARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISQUERYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$346.PFNGLISQUERYARBPROC$FUNC, false
    );
}


