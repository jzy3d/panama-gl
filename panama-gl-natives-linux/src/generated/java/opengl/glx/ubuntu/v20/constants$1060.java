// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$1060 {

    static final FunctionDescriptor glXFreeMemoryNV$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glXFreeMemoryNV$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXFreeMemoryNV",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1060.glXFreeMemoryNV$FUNC, false
    );
    static final FunctionDescriptor PFNGLXALLOCATEMEMORYNVPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLXALLOCATEMEMORYNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1060.PFNGLXALLOCATEMEMORYNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLXFREEMEMORYNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLXFREEMEMORYNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1060.PFNGLXFREEMEMORYNVPROC$FUNC, false
    );
    static final FunctionDescriptor glXBindTexImageARB$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle glXBindTexImageARB$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glXBindTexImageARB",
        "(Ljdk/incubator/foreign/MemoryAddress;JI)I",
        constants$1060.glXBindTexImageARB$FUNC, false
    );
}

