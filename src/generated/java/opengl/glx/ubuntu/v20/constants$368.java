// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$368 {

    static final FunctionDescriptor PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$MH = RuntimeHelper.downcallHandle(
        "(II)I",
        constants$368.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$368.PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$368.PFNGLGETNAMEDFRAMEBUFFERATTACHMENTPARAMETERIVPROC$FUNC, false
    );
}


