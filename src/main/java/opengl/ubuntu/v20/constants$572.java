// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$572 {

    static final FunctionDescriptor PFNGLGETNAMEDBUFFERSUBDATAEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDBUFFERSUBDATAEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$572.PFNGLGETNAMEDBUFFERSUBDATAEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1FEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1FEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$572.PFNGLPROGRAMUNIFORM1FEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2FEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2FEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFF)V",
        constants$572.PFNGLPROGRAMUNIFORM2FEXTPROC$FUNC, false
    );
}


