// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$471 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB1FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB1FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$471.PFNGLVERTEXATTRIB1FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1FVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1FVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$471.PFNGLVERTEXATTRIB1FVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle PFNGLVERTEXATTRIB1SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IS)V",
        constants$471.PFNGLVERTEXATTRIB1SARBPROC$FUNC, false
    );
}


