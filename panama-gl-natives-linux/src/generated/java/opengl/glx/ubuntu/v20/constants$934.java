// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$934 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBI)V",
        constants$934.PFNGLVERTEXATTRIBFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBIFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBIFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$934.PFNGLVERTEXATTRIBIFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETINTEGERUI64I_VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETINTEGERUI64I_VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$934.PFNGLGETINTEGERUI64I_VNVPROC$FUNC, false
    );
}


