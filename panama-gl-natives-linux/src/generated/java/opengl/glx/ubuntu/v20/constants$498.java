// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$498 {

    static final FunctionDescriptor PFNGLVERTEX3BVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEX3BVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$498.PFNGLVERTEX3BVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX4BOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLVERTEX4BOESPROC$MH = RuntimeHelper.downcallHandle(
        "(BBBB)V",
        constants$498.PFNGLVERTEX4BOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX4BVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEX4BVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$498.PFNGLVERTEX4BVOESPROC$FUNC, false
    );
}


