// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$950 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4FNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB4FNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFF)V",
        constants$950.PFNGLVERTEXATTRIB4FNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4FVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4FVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$950.PFNGLVERTEXATTRIB4FVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4SNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB4SNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$950.PFNGLVERTEXATTRIB4SNVPROC$FUNC, false
    );
}


