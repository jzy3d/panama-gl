// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$415 {

    static final FunctionDescriptor PFNGLCOLOR4XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOLOR4XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$415.PFNGLCOLOR4XOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDEPTHRANGEXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDEPTHRANGEXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$415.PFNGLDEPTHRANGEXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFOGXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLFOGXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$415.PFNGLFOGXOESPROC$FUNC, false
    );
}


