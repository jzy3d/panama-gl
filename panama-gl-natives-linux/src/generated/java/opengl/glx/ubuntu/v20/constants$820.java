// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$820 {

    static final FunctionDescriptor PFNGLDRAWCOMMANDSSTATESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWCOMMANDSSTATESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$820.PFNGLDRAWCOMMANDSSTATESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$820.PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATECOMMANDLISTSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATECOMMANDLISTSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$820.PFNGLCREATECOMMANDLISTSNVPROC$FUNC, false
    );
}


