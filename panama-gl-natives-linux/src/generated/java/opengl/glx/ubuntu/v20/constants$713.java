// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$713 {

    static final FunctionDescriptor PFNGLBINDFRAMEBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDFRAMEBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$713.PFNGLBINDFRAMEBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEFRAMEBUFFERSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEFRAMEBUFFERSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$713.PFNGLDELETEFRAMEBUFFERSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENFRAMEBUFFERSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENFRAMEBUFFERSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$713.PFNGLGENFRAMEBUFFERSEXTPROC$FUNC, false
    );
}


