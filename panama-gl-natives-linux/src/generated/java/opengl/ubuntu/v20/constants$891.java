// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$891 {

    static final FunctionDescriptor PFNGLFINISHASYNCSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLFINISHASYNCSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$891.PFNGLFINISHASYNCSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOLLASYNCSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPOLLASYNCSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$891.PFNGLPOLLASYNCSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENASYNCMARKERSSGIXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGENASYNCMARKERSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$891.PFNGLGENASYNCMARKERSSGIXPROC$FUNC, false
    );
}


