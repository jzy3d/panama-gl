// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$582 {

    static final FunctionDescriptor PFNGLGETOBJECTBUFFERFVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETOBJECTBUFFERFVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$582.PFNGLGETOBJECTBUFFERFVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETOBJECTBUFFERIVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETOBJECTBUFFERIVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$582.PFNGLGETOBJECTBUFFERIVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFREEOBJECTBUFFERATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFREEOBJECTBUFFERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$582.PFNGLFREEOBJECTBUFFERATIPROC$FUNC, false
    );
}


