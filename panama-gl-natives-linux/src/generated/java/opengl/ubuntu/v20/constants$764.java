// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$764 {

    static final FunctionDescriptor PFNGLVERTEX2HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEX2HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(SS)V",
        constants$764.PFNGLVERTEX2HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX2HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEX2HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$764.PFNGLVERTEX2HVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX3HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEX3HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$764.PFNGLVERTEX3HNVPROC$FUNC, false
    );
}


