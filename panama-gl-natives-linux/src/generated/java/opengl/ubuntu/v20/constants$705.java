// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$705 {

    static final FunctionDescriptor PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$705.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSYNCTEXTUREINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLSYNCTEXTUREINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$705.PFNGLSYNCTEXTUREINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNMAPTEXTURE2DINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNMAPTEXTURE2DINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$705.PFNGLUNMAPTEXTURE2DINTELPROC$FUNC, false
    );
}


