// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$220 {

    static final FunctionDescriptor PFNGLGETSHADERPRECISIONFORMATPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETSHADERPRECISIONFORMATPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$220.PFNGLGETSHADERPRECISIONFORMATPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDEPTHRANGEFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLDEPTHRANGEFPROC$MH = RuntimeHelper.downcallHandle(
        "(FF)V",
        constants$220.PFNGLDEPTHRANGEFPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARDEPTHFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle PFNGLCLEARDEPTHFPROC$MH = RuntimeHelper.downcallHandle(
        "(F)V",
        constants$220.PFNGLCLEARDEPTHFPROC$FUNC, false
    );
}


