// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$520 {

    static final FunctionDescriptor PFNGLMAPGRID2XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMAPGRID2XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$520.PFNGLMAPGRID2XOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTTRANSPOSEMATRIXXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLMULTTRANSPOSEMATRIXXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$520.PFNGLMULTTRANSPOSEMATRIXXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD1XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORD1XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$520.PFNGLMULTITEXCOORD1XOESPROC$FUNC, false
    );
}


