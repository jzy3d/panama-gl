// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$389 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB3DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB3DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$389.PFNGLVERTEXATTRIB3DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB3DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$389.PFNGLVERTEXATTRIB3DVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB3FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$389.PFNGLVERTEXATTRIB3FARBPROC$FUNC, false
    );
}


