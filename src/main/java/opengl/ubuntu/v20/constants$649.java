// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$649 {

    static final FunctionDescriptor PFNGLSAMPLEPATTERNEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLSAMPLEPATTERNEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$649.PFNGLSAMPLEPATTERNEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOLORTABLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOLORTABLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$649.PFNGLCOLORTABLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOLORTABLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOLORTABLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$649.PFNGLGETCOLORTABLEEXTPROC$FUNC, false
    );
}


