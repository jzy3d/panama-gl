// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$708 {

    static final FunctionDescriptor PFNGLCREATEPERFQUERYINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATEPERFQUERYINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$708.PFNGLCREATEPERFQUERYINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPERFQUERYINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDELETEPERFQUERYINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$708.PFNGLDELETEPERFQUERYINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDPERFQUERYINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENDPERFQUERYINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$708.PFNGLENDPERFQUERYINTELPROC$FUNC, false
    );
}


