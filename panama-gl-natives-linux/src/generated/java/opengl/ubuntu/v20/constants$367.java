// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$367 {

    static final FunctionDescriptor PFNGLUNIFORMMATRIX3FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX3FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$367.PFNGLUNIFORMMATRIX3FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMMATRIX4FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX4FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$367.PFNGLUNIFORMMATRIX4FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETOBJECTPARAMETERFVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETOBJECTPARAMETERFVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$367.PFNGLGETOBJECTPARAMETERFVARBPROC$FUNC, false
    );
}


