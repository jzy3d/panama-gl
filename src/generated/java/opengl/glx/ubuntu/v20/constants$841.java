// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$841 {

    static final FunctionDescriptor PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$841.PFNGLMULTICASTFRAMEBUFFERSAMPLELOCATIONSFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTICASTBARRIERNVPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLMULTICASTBARRIERNVPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$841.PFNGLMULTICASTBARRIERNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTICASTWAITSYNCNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTICASTWAITSYNCNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$841.PFNGLMULTICASTWAITSYNCNVPROC$FUNC, false
    );
}


