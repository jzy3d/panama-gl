// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$624 {

    static final FunctionDescriptor PFNGLFOGCOORDDVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLFOGCOORDDVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$624.PFNGLFOGCOORDDVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFOGCOORDPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLFOGCOORDPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$624.PFNGLFOGCOORDPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLITFRAMEBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBLITFRAMEBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIII)V",
        constants$624.PFNGLBLITFRAMEBUFFEREXTPROC$FUNC, false
    );
}


