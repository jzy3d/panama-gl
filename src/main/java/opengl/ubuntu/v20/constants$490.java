// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$490 {

    static final FunctionDescriptor PFNGLBEGINFRAGMENTSHADERATIPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLBEGINFRAGMENTSHADERATIPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$490.PFNGLBEGINFRAGMENTSHADERATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDFRAGMENTSHADERATIPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLENDFRAGMENTSHADERATIPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$490.PFNGLENDFRAGMENTSHADERATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPASSTEXCOORDATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPASSTEXCOORDATIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$490.PFNGLPASSTEXCOORDATIPROC$FUNC, false
    );
}

