// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$922 {

    static final FunctionDescriptor PFNGLVDPAUUNREGISTERSURFACENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLVDPAUUNREGISTERSURFACENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$922.PFNGLVDPAUUNREGISTERSURFACENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVDPAUGETSURFACEIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLVDPAUGETSURFACEIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$922.PFNGLVDPAUGETSURFACEIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVDPAUSURFACEACCESSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLVDPAUSURFACEACCESSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JI)V",
        constants$922.PFNGLVDPAUSURFACEACCESSNVPROC$FUNC, false
    );
}


