// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$190 {

    static final FunctionDescriptor PFNGLWINDOWPOS3FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3FVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$190.PFNGLWINDOWPOS3FVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLWINDOWPOS3IPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$190.PFNGLWINDOWPOS3IPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3IVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$190.PFNGLWINDOWPOS3IVPROC$FUNC, false
    );
}

