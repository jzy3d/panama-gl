// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$508 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM3DATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXSTREAM3DATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$508.PFNGLVERTEXSTREAM3DATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3DVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM3DVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$508.PFNGLVERTEXSTREAM3DVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM4SATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXSTREAM4SATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$508.PFNGLVERTEXSTREAM4SATIPROC$FUNC, false
    );
}


