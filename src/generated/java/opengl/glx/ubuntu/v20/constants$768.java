// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$768 {

    static final FunctionDescriptor PFNGLBINDVERTEXSHADEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBINDVERTEXSHADEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$768.PFNGLBINDVERTEXSHADEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENVERTEXSHADERSEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGENVERTEXSHADERSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$768.PFNGLGENVERTEXSHADERSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEVERTEXSHADEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDELETEVERTEXSHADEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$768.PFNGLDELETEVERTEXSHADEREXTPROC$FUNC, false
    );
}


