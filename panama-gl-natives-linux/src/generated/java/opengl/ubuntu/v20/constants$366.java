// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$366 {

    static final FunctionDescriptor PFNGLUNIFORM3IVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM3IVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$366.PFNGLUNIFORM3IVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4IVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM4IVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$366.PFNGLUNIFORM4IVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMMATRIX2FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX2FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$366.PFNGLUNIFORMMATRIX2FVARBPROC$FUNC, false
    );
}


