// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$594 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM4SATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXSTREAM4SATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$594.PFNGLVERTEXSTREAM4SATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM4SVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM4SVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$594.PFNGLVERTEXSTREAM4SVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM4IATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXSTREAM4IATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$594.PFNGLVERTEXSTREAM4IATIPROC$FUNC, false
    );
}

