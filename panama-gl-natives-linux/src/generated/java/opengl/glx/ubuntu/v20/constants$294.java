// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$294 {

    static final FunctionDescriptor PFNGLUNIFORM4DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM4DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$294.PFNGLUNIFORM4DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMMATRIX2DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX2DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$294.PFNGLUNIFORMMATRIX2DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMMATRIX3DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX3DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$294.PFNGLUNIFORMMATRIX3DVPROC$FUNC, false
    );
}


