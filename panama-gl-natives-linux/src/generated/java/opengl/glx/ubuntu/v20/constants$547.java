// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$547 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM1I64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM1I64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJ)V",
        constants$547.PFNGLPROGRAMUNIFORM1I64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM2I64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM2I64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJ)V",
        constants$547.PFNGLPROGRAMUNIFORM2I64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM3I64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM3I64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJJ)V",
        constants$547.PFNGLPROGRAMUNIFORM3I64NVPROC$FUNC, false
    );
}


