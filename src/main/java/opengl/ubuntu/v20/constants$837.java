// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$837 {

    static final FunctionDescriptor PFNGLVDPAUGETSURFACEIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLVDPAUGETSURFACEIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$837.PFNGLVDPAUGETSURFACEIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVDPAUSURFACEACCESSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLVDPAUSURFACEACCESSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JI)V",
        constants$837.PFNGLVDPAUSURFACEACCESSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVDPAUMAPSURFACESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVDPAUMAPSURFACESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$837.PFNGLVDPAUMAPSURFACESNVPROC$FUNC, false
    );
}


