// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$172 {

    static final FunctionDescriptor PFNGLFRAMEBUFFERTEXTURELAYERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFRAMEBUFFERTEXTURELAYERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$172.PFNGLFRAMEBUFFERTEXTURELAYERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPBUFFERRANGEPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_LONG,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLMAPBUFFERRANGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJI)Ljdk/incubator/foreign/MemoryAddress;",
        constants$172.PFNGLMAPBUFFERRANGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFLUSHMAPPEDBUFFERRANGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLFLUSHMAPPEDBUFFERRANGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJ)V",
        constants$172.PFNGLFLUSHMAPPEDBUFFERRANGEPROC$FUNC, false
    );
}


