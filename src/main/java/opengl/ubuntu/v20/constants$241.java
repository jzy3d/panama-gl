// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$241 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$241.PFNGLPROGRAMUNIFORMMATRIX4X3DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVALIDATEPROGRAMPIPELINEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLVALIDATEPROGRAMPIPELINEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$241.PFNGLVALIDATEPROGRAMPIPELINEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMPIPELINEINFOLOGPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMPIPELINEINFOLOGPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$241.PFNGLGETPROGRAMPIPELINEINFOLOGPROC$FUNC, false
    );
}


