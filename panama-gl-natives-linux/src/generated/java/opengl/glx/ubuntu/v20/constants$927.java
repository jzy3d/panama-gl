// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$927 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBL4I64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBL4I64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$927.PFNGLVERTEXATTRIBL4I64VNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL1UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXATTRIBL1UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJ)V",
        constants$927.PFNGLVERTEXATTRIBL1UI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL2UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXATTRIBL2UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJ)V",
        constants$927.PFNGLVERTEXATTRIBL2UI64NVPROC$FUNC, false
    );
}


