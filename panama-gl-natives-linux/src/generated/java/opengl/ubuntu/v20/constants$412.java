// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$412 {

    static final FunctionDescriptor PFNGLVERTEX2BVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEX2BVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$412.PFNGLVERTEX2BVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX3BOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLVERTEX3BOESPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$412.PFNGLVERTEX3BOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEX3BVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEX3BVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$412.PFNGLVERTEX3BVOESPROC$FUNC, false
    );
}


