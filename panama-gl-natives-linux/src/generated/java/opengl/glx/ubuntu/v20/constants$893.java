// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$893 {

    static final FunctionDescriptor PFNGLPIXELDATARANGENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPIXELDATARANGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$893.PFNGLPIXELDATARANGENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFLUSHPIXELDATARANGENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFLUSHPIXELDATARANGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$893.PFNGLFLUSHPIXELDATARANGENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPOINTPARAMETERINVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPOINTPARAMETERINVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$893.PFNGLPOINTPARAMETERINVPROC$FUNC, false
    );
}

