// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$387 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB2DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$387.PFNGLVERTEXATTRIB2DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$387.PFNGLVERTEXATTRIB2DVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$387.PFNGLVERTEXATTRIB2FARBPROC$FUNC, false
    );
}

