// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$308 {

    static final FunctionDescriptor PFNGLCREATESHADERPROGRAMVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATESHADERPROGRAMVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$308.PFNGLCREATESHADERPROGRAMVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDPROGRAMPIPELINEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBINDPROGRAMPIPELINEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$308.PFNGLBINDPROGRAMPIPELINEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPROGRAMPIPELINESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEPROGRAMPIPELINESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$308.PFNGLDELETEPROGRAMPIPELINESPROC$FUNC, false
    );
}

