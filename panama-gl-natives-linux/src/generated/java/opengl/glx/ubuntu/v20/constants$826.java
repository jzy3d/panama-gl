// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$826 {

    static final FunctionDescriptor PFNGLDRAWTEXTURENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLDRAWTEXTURENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFFFFFFFFF)V",
        constants$826.PFNGLDRAWTEXTURENVPROC$FUNC, false
    );
    static final FunctionDescriptor GLVULKANPROCNV$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GLVULKANPROCNV$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$826.GLVULKANPROCNV$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWVKIMAGENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLDRAWVKIMAGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(JIFFFFFFFFF)V",
        constants$826.PFNGLDRAWVKIMAGENVPROC$FUNC, false
    );
}


