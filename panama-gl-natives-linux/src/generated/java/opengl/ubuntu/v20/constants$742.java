// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$742 {

    static final FunctionDescriptor PFNGLWAITVKSEMAPHORENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLWAITVKSEMAPHORENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$742.PFNGLWAITVKSEMAPHORENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSIGNALVKSEMAPHORENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLSIGNALVKSEMAPHORENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$742.PFNGLSIGNALVKSEMAPHORENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSIGNALVKFENCENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLSIGNALVKFENCENVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$742.PFNGLSIGNALVKFENCENVPROC$FUNC, false
    );
}


