// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$900 {

    static final FunctionDescriptor PFNGLINSTRUMENTSBUFFERSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLINSTRUMENTSBUFFERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$900.PFNGLINSTRUMENTSBUFFERSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOLLINSTRUMENTSSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPOLLINSTRUMENTSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$900.PFNGLPOLLINSTRUMENTSSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREADINSTRUMENTSSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLREADINSTRUMENTSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$900.PFNGLREADINSTRUMENTSSGIXPROC$FUNC, false
    );
}


