// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$593 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM3FVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM3FVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$593.PFNGLVERTEXSTREAM3FVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3DATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXSTREAM3DATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$593.PFNGLVERTEXSTREAM3DATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM3DVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM3DVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$593.PFNGLVERTEXSTREAM3DVATIPROC$FUNC, false
    );
}


