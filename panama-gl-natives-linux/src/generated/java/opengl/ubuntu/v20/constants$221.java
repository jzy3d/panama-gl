// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$221 {

    static final FunctionDescriptor PFNGLGETPROGRAMBINARYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMBINARYPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$221.PFNGLGETPROGRAMBINARYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMBINARYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMBINARYPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$221.PFNGLPROGRAMBINARYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMPARAMETERIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMPARAMETERIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$221.PFNGLPROGRAMPARAMETERIPROC$FUNC, false
    );
}

