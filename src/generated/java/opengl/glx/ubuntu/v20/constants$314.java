// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$314 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2DPROC$MH = RuntimeHelper.downcallHandle(
        "(IIDD)V",
        constants$314.PFNGLPROGRAMUNIFORM2DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$314.PFNGLPROGRAMUNIFORM2DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2UIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$314.PFNGLPROGRAMUNIFORM2UIPROC$FUNC, false
    );
}


