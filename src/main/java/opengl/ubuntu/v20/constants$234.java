// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$234 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4DPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDDDD)V",
        constants$234.PFNGLPROGRAMUNIFORM4DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$234.PFNGLPROGRAMUNIFORM4DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$234.PFNGLPROGRAMUNIFORM4UIPROC$FUNC, false
    );
}


