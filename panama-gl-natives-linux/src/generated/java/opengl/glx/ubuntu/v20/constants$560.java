// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$560 {

    static final FunctionDescriptor PFNGLTESSELLATIONMODEAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLTESSELLATIONMODEAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$560.PFNGLTESSELLATIONMODEAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLELEMENTPOINTERAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLELEMENTPOINTERAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$560.PFNGLELEMENTPOINTERAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWELEMENTARRAYAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWELEMENTARRAYAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$560.PFNGLDRAWELEMENTARRAYAPPLEPROC$FUNC, false
    );
}


