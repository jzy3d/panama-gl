// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$92 {

    static final FunctionDescriptor PFNGLMULTIDRAWELEMENTSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLMULTIDRAWELEMENTSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$92.PFNGLMULTIDRAWELEMENTSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOINTPARAMETERFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPOINTPARAMETERFPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$92.PFNGLPOINTPARAMETERFPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOINTPARAMETERFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPOINTPARAMETERFVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$92.PFNGLPOINTPARAMETERFVPROC$FUNC, false
    );
}


