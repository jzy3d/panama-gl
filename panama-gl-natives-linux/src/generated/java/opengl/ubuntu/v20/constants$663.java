// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$663 {

    static final FunctionDescriptor PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$663.PFNGLIMPORTSEMAPHOREWIN32HANDLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$663.PFNGLIMPORTSEMAPHOREWIN32NAMEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUSESHADERPROGRAMEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUSESHADERPROGRAMEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$663.PFNGLUSESHADERPROGRAMEXTPROC$FUNC, false
    );
}


