// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$767 {

    static final FunctionDescriptor PFNGLCOLOR3HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLCOLOR3HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$767.PFNGLCOLOR3HVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOLOR4HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLCOLOR4HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(SSSS)V",
        constants$767.PFNGLCOLOR4HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOLOR4HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLCOLOR4HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$767.PFNGLCOLOR4HVNVPROC$FUNC, false
    );
}


