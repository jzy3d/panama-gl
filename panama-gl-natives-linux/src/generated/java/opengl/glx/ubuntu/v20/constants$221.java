// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$221 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2SVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2SVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$221.PFNGLVERTEXATTRIB2SVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB3DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$221.PFNGLVERTEXATTRIB3DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB3DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB3DVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$221.PFNGLVERTEXATTRIB3DVPROC$FUNC, false
    );
}


