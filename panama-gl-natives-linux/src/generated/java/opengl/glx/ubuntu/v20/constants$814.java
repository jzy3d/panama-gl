// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$814 {

    static final FunctionDescriptor PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$814.PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMHANDLEUI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLUNIFORMHANDLEUI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJ)V",
        constants$814.PFNGLUNIFORMHANDLEUI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMHANDLEUI64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMHANDLEUI64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$814.PFNGLUNIFORMHANDLEUI64VNVPROC$FUNC, false
    );
}


