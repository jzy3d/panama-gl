// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$579 {

    static final FunctionDescriptor PFNGLMAPOBJECTBUFFERATIPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLMAPOBJECTBUFFERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$579.PFNGLMAPOBJECTBUFFERATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNMAPOBJECTBUFFERATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLUNMAPOBJECTBUFFERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$579.PFNGLUNMAPOBJECTBUFFERATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPNTRIANGLESIATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPNTRIANGLESIATIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$579.PFNGLPNTRIANGLESIATIPROC$FUNC, false
    );
}


