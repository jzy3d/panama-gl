// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$505 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM2FVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM2FVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$505.PFNGLVERTEXSTREAM2FVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM2DATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXSTREAM2DATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$505.PFNGLVERTEXSTREAM2DATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM2DVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM2DVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$505.PFNGLVERTEXSTREAM2DVATIPROC$FUNC, false
    );
}


