// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$859 {

    static final FunctionDescriptor PFNGLFOGCOORDHVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLFOGCOORDHVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$859.PFNGLFOGCOORDHVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$859.PFNGLSECONDARYCOLOR3HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$859.PFNGLSECONDARYCOLOR3HVNVPROC$FUNC, false
    );
}


