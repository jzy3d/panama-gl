// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$600 {

    static final FunctionDescriptor PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$600.PFNGLCLIENTACTIVEVERTEXSTREAMATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXBLENDENVIATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXBLENDENVIATIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$600.PFNGLVERTEXBLENDENVIATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXBLENDENVFATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXBLENDENVFATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$600.PFNGLVERTEXBLENDENVFATIPROC$FUNC, false
    );
}


