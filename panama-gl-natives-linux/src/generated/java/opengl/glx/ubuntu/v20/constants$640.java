// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$640 {

    static final FunctionDescriptor PFNGLMULTITEXPARAMETERFEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLMULTITEXPARAMETERFEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIF)V",
        constants$640.PFNGLMULTITEXPARAMETERFEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXPARAMETERFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXPARAMETERFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$640.PFNGLMULTITEXPARAMETERFVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXIMAGE1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXIMAGE1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$640.PFNGLMULTITEXIMAGE1DEXTPROC$FUNC, false
    );
}

