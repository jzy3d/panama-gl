// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$827 {

    static final FunctionDescriptor PFNGLGETVKPROCADDRNVPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVKPROCADDRNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$827.PFNGLGETVKPROCADDRNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWAITVKSEMAPHORENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLWAITVKSEMAPHORENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$827.PFNGLWAITVKSEMAPHORENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSIGNALVKSEMAPHORENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLSIGNALVKSEMAPHORENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$827.PFNGLSIGNALVKSEMAPHORENVPROC$FUNC, false
    );
}


