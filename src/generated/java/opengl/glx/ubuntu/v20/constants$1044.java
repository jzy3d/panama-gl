// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1044 {

    static final FunctionDescriptor PFNGLXGETVIDEODEVICENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLXGETVIDEODEVICENVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1044.PFNGLXGETVIDEODEVICENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXRELEASEVIDEODEVICENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLXRELEASEVIDEODEVICENVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$1044.PFNGLXRELEASEVIDEODEVICENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXBINDVIDEOIMAGENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLXBINDVIDEOIMAGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJI)I",
        constants$1044.PFNGLXBINDVIDEOIMAGENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXRELEASEVIDEOIMAGENVPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
}


