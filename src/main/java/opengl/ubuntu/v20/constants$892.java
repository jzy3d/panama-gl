// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$892 {

    static final FunctionDescriptor PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDELETEASYNCMARKERSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$892.PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISASYNCMARKERSGIXPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISASYNCMARKERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$892.PFNGLISASYNCMARKERSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFLUSHRASTERSGIXPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLFLUSHRASTERSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$892.PFNGLFLUSHRASTERSGIXPROC$FUNC, false
    );
}


