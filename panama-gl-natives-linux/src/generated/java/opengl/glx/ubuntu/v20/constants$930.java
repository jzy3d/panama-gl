// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$930 {

    static final FunctionDescriptor PFNGLGETVERTEXATTRIBLI64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBLI64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$930.PFNGLGETVERTEXATTRIBLI64VNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBLUI64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBLUI64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$930.PFNGLGETVERTEXATTRIBLUI64VNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBLFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBLFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$930.PFNGLVERTEXATTRIBLFORMATNVPROC$FUNC, false
    );
}


