// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$532 {

    static final FunctionDescriptor PFNGLVERTEX3XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEX3XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$532.PFNGLVERTEX3XOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX3XVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEX3XVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$532.PFNGLVERTEX3XVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX4XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEX4XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$532.PFNGLVERTEX4XOESPROC$FUNC, false
    );
}


