// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$84 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD2FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLMULTITEXCOORD2FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$84.PFNGLMULTITEXCOORD2FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD2FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$84.PFNGLMULTITEXCOORD2FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORD2IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$84.PFNGLMULTITEXCOORD2IARBPROC$FUNC, false
    );
}


