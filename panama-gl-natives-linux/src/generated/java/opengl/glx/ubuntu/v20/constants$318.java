// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$318 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4IPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4IPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$318.PFNGLPROGRAMUNIFORM4IPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4IVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4IVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$318.PFNGLPROGRAMUNIFORM4IVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORM4FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPROGRAMUNIFORM4FPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFFFF)V",
        constants$318.PFNGLPROGRAMUNIFORM4FPROC$FUNC, false
    );
}


