// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$304 {

    static final FunctionDescriptor PFNGLGETGRAPHICSRESETSTATUSPROC$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle PFNGLGETGRAPHICSRESETSTATUSPROC$MH = RuntimeHelper.downcallHandle(
        "()I",
        constants$304.PFNGLGETGRAPHICSRESETSTATUSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNCOMPRESSEDTEXIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNCOMPRESSEDTEXIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$304.PFNGLGETNCOMPRESSEDTEXIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNTEXIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNTEXIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$304.PFNGLGETNTEXIMAGEPROC$FUNC, false
    );
}

