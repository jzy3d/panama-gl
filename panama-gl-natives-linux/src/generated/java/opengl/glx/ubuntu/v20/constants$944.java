// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$944 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB1FNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB1FNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$944.PFNGLVERTEXATTRIB1FNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1FVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1FVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$944.PFNGLVERTEXATTRIB1FVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1SNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB1SNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IS)V",
        constants$944.PFNGLVERTEXATTRIB1SNVPROC$FUNC, false
    );
}


