// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$964 {

    static final FunctionDescriptor PFNGLBEGINVIDEOCAPTURENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBEGINVIDEOCAPTURENVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$964.PFNGLBEGINVIDEOCAPTURENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJ)V",
        constants$964.PFNGLBINDVIDEOCAPTURESTREAMBUFFERNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$964.PFNGLBINDVIDEOCAPTURESTREAMTEXTURENVPROC$FUNC, false
    );
}

