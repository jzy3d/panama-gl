// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$493 {

    static final FunctionDescriptor PFNGLALPHAFRAGMENTOP3ATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
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
    static final MethodHandle PFNGLALPHAFRAGMENTOP3ATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIII)V",
        constants$493.PFNGLALPHAFRAGMENTOP3ATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSETFRAGMENTSHADERCONSTANTATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSETFRAGMENTSHADERCONSTANTATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$493.PFNGLSETFRAGMENTSHADERCONSTANTATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPOBJECTBUFFERATIPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLMAPOBJECTBUFFERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$493.PFNGLMAPOBJECTBUFFERATIPROC$FUNC, false
    );
}

