// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$97 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3FVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$97.PFNGLSECONDARYCOLOR3FVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3IPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$97.PFNGLSECONDARYCOLOR3IPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3IVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$97.PFNGLSECONDARYCOLOR3IVPROC$FUNC, false
    );
}


