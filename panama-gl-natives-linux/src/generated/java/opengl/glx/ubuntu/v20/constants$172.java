// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$172 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD3FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLMULTITEXCOORD3FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$172.PFNGLMULTITEXCOORD3FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD3FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD3FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$172.PFNGLMULTITEXCOORD3FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD3IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORD3IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$172.PFNGLMULTITEXCOORD3IARBPROC$FUNC, false
    );
}


