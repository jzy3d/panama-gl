// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$310 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1IPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$310.PFNGLPROGRAMUNIFORM1IPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1IVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$310.PFNGLPROGRAMUNIFORM1IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1FPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$310.PFNGLPROGRAMUNIFORM1FPROC$FUNC, false
    );
}


