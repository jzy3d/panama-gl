// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$946 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB2FNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2FNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$946.PFNGLVERTEXATTRIB2FNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2FVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB2FVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$946.PFNGLVERTEXATTRIB2FVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB2SNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB2SNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISS)V",
        constants$946.PFNGLVERTEXATTRIB2SNVPROC$FUNC, false
    );
}


