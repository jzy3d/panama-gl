// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$169 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD2DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD2DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$169.PFNGLMULTITEXCOORD2DVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLMULTITEXCOORD2FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$169.PFNGLMULTITEXCOORD2FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD2FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$169.PFNGLMULTITEXCOORD2FVARBPROC$FUNC, false
    );
}

