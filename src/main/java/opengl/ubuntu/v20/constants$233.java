// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$233 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4IVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$233.PFNGLPROGRAMUNIFORM4IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4FPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFFFF)V",
        constants$233.PFNGLPROGRAMUNIFORM4FPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4FVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$233.PFNGLPROGRAMUNIFORM4FVPROC$FUNC, false
    );
}

