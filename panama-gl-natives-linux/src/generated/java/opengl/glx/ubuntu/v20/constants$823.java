// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$823 {

    static final FunctionDescriptor PFNGLBEGINCONDITIONALRENDERNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBEGINCONDITIONALRENDERNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$823.PFNGLBEGINCONDITIONALRENDERNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDCONDITIONALRENDERNVPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLENDCONDITIONALRENDERNVPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$823.PFNGLENDCONDITIONALRENDERNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSUBPIXELPRECISIONBIASNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSUBPIXELPRECISIONBIASNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$823.PFNGLSUBPIXELPRECISIONBIASNVPROC$FUNC, false
    );
}


