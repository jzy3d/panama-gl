// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$502 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM1FATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXSTREAM1FATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$502.PFNGLVERTEXSTREAM1FATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1FVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM1FVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$502.PFNGLVERTEXSTREAM1FVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1DATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXSTREAM1DATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$502.PFNGLVERTEXSTREAM1DATIPROC$FUNC, false
    );
}


