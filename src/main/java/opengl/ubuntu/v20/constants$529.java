// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$529 {

    static final FunctionDescriptor PFNGLBINORMAL3FEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLBINORMAL3FEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(FFF)V",
        constants$529.PFNGLBINORMAL3FEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3FVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLBINORMAL3FVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$529.PFNGLBINORMAL3FVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3IEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINORMAL3IEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$529.PFNGLBINORMAL3IEXTPROC$FUNC, false
    );
}

