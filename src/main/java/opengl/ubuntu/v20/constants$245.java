// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$245 {

    static final FunctionDescriptor PFNGLGETVERTEXATTRIBLDVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBLDVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$245.PFNGLGETVERTEXATTRIBLDVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVIEWPORTARRAYVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVIEWPORTARRAYVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$245.PFNGLVIEWPORTARRAYVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVIEWPORTINDEXEDFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVIEWPORTINDEXEDFPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFF)V",
        constants$245.PFNGLVIEWPORTINDEXEDFPROC$FUNC, false
    );
}


