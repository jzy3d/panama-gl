// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$301 {

    static final FunctionDescriptor PFNGLCREATEPROGRAMPIPELINESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATEPROGRAMPIPELINESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$301.PFNGLCREATEPROGRAMPIPELINESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATEQUERIESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATEQUERIESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$301.PFNGLCREATEQUERIESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETQUERYBUFFEROBJECTI64VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLGETQUERYBUFFEROBJECTI64VPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJ)V",
        constants$301.PFNGLGETQUERYBUFFEROBJECTI64VPROC$FUNC, false
    );
}

