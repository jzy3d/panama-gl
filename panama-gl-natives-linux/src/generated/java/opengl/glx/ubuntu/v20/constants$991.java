// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$991 {

    static final FunctionDescriptor PFNGLSPRITEPARAMETERFSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLSPRITEPARAMETERFSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$991.PFNGLSPRITEPARAMETERFSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSPRITEPARAMETERFVSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSPRITEPARAMETERFVSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$991.PFNGLSPRITEPARAMETERFVSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSPRITEPARAMETERISGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSPRITEPARAMETERISGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$991.PFNGLSPRITEPARAMETERISGIXPROC$FUNC, false
    );
}


