// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$309 {

    static final FunctionDescriptor PFNGLGENPROGRAMPIPELINESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENPROGRAMPIPELINESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$309.PFNGLGENPROGRAMPIPELINESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISPROGRAMPIPELINEPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISPROGRAMPIPELINEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$309.PFNGLISPROGRAMPIPELINEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMPIPELINEIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMPIPELINEIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$309.PFNGLGETPROGRAMPIPELINEIVPROC$FUNC, false
    );
}


