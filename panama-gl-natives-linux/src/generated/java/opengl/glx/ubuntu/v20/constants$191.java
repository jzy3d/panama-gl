// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$191 {

    static final FunctionDescriptor PFNGLWINDOWPOS3SPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLWINDOWPOS3SPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$191.PFNGLWINDOWPOS3SPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLWINDOWPOS3SVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLWINDOWPOS3SVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$191.PFNGLWINDOWPOS3SVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBLENDCOLORPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLBLENDCOLORPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFF)V",
        constants$191.PFNGLBLENDCOLORPROC$FUNC, false
    );
}


