// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$358 {

    static final FunctionDescriptor PFNGLCREATEBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATEBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$358.PFNGLCREATEBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDBUFFERSTORAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDBUFFERSTORAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$358.PFNGLNAMEDBUFFERSTORAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$358.PFNGLNAMEDBUFFERDATAPROC$FUNC, false
    );
}


