// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$512 {

    static final FunctionDescriptor PFNGLNORMALSTREAM3SATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLNORMALSTREAM3SATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSS)V",
        constants$512.PFNGLNORMALSTREAM3SATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNORMALSTREAM3SVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNORMALSTREAM3SVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$512.PFNGLNORMALSTREAM3SVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNORMALSTREAM3IATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNORMALSTREAM3IATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$512.PFNGLNORMALSTREAM3IATIPROC$FUNC, false
    );
}

