// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$475 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB3FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB3FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$475.PFNGLVERTEXATTRIB3FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB3FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$475.PFNGLVERTEXATTRIB3FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB3SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSS)V",
        constants$475.PFNGLVERTEXATTRIB3SARBPROC$FUNC, false
    );
}


