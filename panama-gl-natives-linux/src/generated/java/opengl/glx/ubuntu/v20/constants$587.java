// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$587 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM1IVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM1IVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$587.PFNGLVERTEXSTREAM1IVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1FATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXSTREAM1FATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$587.PFNGLVERTEXSTREAM1FATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM1FVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM1FVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$587.PFNGLVERTEXSTREAM1FVATIPROC$FUNC, false
    );
}


