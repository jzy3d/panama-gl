// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$294 {

    static final FunctionDescriptor PFNGLGETTEXTURELEVELPARAMETERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXTURELEVELPARAMETERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$294.PFNGLGETTEXTURELEVELPARAMETERFVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTEXTURELEVELPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXTURELEVELPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$294.PFNGLGETTEXTURELEVELPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTEXTUREPARAMETERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXTUREPARAMETERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$294.PFNGLGETTEXTUREPARAMETERFVPROC$FUNC, false
    );
}


