// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$531 {

    static final FunctionDescriptor PFNGLTANGENTPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTANGENTPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$531.PFNGLTANGENTPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMALPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBINORMALPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$531.PFNGLBINORMALPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYTEXIMAGE1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYTEXIMAGE1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIII)V",
        constants$531.PFNGLCOPYTEXIMAGE1DEXTPROC$FUNC, false
    );
}


