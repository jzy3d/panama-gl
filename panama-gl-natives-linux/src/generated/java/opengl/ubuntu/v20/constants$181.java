// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$181 {

    static final FunctionDescriptor PFNGLCLIENTWAITSYNCPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLCLIENTWAITSYNCPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$181.PFNGLCLIENTWAITSYNCPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWAITSYNCPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLWAITSYNCPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)V",
        constants$181.PFNGLWAITSYNCPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETINTEGER64VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETINTEGER64VPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$181.PFNGLGETINTEGER64VPROC$FUNC, false
    );
}


