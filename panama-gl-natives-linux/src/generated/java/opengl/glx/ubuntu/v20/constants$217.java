// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$217 {

    static final FunctionDescriptor PFNGLVALIDATEPROGRAMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLVALIDATEPROGRAMPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$217.PFNGLVALIDATEPROGRAMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$217.PFNGLVERTEXATTRIB1DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1DVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$217.PFNGLVERTEXATTRIB1DVPROC$FUNC, false
    );
}


