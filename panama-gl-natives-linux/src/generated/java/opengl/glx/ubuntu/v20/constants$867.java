// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$867 {

    static final FunctionDescriptor PFNGLDRAWMESHTASKSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWMESHTASKSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$867.PFNGLDRAWMESHTASKSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWMESHTASKSINDIRECTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLDRAWMESHTASKSINDIRECTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$867.PFNGLDRAWMESHTASKSINDIRECTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JII)V",
        constants$867.PFNGLMULTIDRAWMESHTASKSINDIRECTNVPROC$FUNC, false
    );
}

