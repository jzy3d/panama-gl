// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$134 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB2DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$134.PFNGLVERTEXATTRIB2DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2DVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$134.PFNGLVERTEXATTRIB2DVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2FPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2FPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$134.PFNGLVERTEXATTRIB2FPROC$FUNC, false
    );
}


