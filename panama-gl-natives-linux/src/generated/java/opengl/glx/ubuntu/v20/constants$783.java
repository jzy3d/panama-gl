// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$783 {

    static final FunctionDescriptor PFNGLWINDOWRECTANGLESEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWRECTANGLESEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$783.PFNGLWINDOWRECTANGLESEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLIMPORTSYNCEXTPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLIMPORTSYNCEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJI)Ljdk/incubator/foreign/MemoryAddress;",
        constants$783.PFNGLIMPORTSYNCEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMETERMINATORGREMEDYPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLFRAMETERMINATORGREMEDYPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$783.PFNGLFRAMETERMINATORGREMEDYPROC$FUNC, false
    );
}


