// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$506 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM3SATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXSTREAM3SATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSS)V",
        constants$506.PFNGLVERTEXSTREAM3SATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3SVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM3SVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$506.PFNGLVERTEXSTREAM3SVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3IATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXSTREAM3IATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$506.PFNGLVERTEXSTREAM3IATIPROC$FUNC, false
    );
}

