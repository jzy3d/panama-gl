// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$506 {

    static final FunctionDescriptor PFNGLMULTMATRIXXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLMULTMATRIXXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$506.PFNGLMULTMATRIXXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD4XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORD4XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$506.PFNGLMULTITEXCOORD4XOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNORMAL3XOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNORMAL3XOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$506.PFNGLNORMAL3XOESPROC$FUNC, false
    );
}


