// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$828 {

    static final FunctionDescriptor PFNGLSIGNALVKFENCENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLSIGNALVKFENCENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$828.PFNGLSIGNALVKFENCENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPCONTROLPOINTSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPCONTROLPOINTSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$828.PFNGLMAPCONTROLPOINTSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPPARAMETERIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPPARAMETERIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$828.PFNGLMAPPARAMETERIVNVPROC$FUNC, false
    );
}


