// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$542 {

    static final FunctionDescriptor PFNGLUNIFORM4I64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLUNIFORM4I64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJJJ)V",
        constants$542.PFNGLUNIFORM4I64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1I64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1I64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$542.PFNGLUNIFORM1I64VNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2I64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM2I64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$542.PFNGLUNIFORM2I64VNVPROC$FUNC, false
    );
}


