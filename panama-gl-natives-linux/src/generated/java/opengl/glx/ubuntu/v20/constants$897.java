// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$897 {

    static final FunctionDescriptor PFNGLQUERYRESOURCENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLQUERYRESOURCENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$897.PFNGLQUERYRESOURCENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENQUERYRESOURCETAGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENQUERYRESOURCETAGNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$897.PFNGLGENQUERYRESOURCETAGNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEQUERYRESOURCETAGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEQUERYRESOURCETAGNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$897.PFNGLDELETEQUERYRESOURCETAGNVPROC$FUNC, false
    );
}

