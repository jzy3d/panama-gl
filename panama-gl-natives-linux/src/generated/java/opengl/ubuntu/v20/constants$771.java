// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$771 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD1HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD1HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$771.PFNGLMULTITEXCOORD1HVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD2HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISS)V",
        constants$771.PFNGLMULTITEXCOORD2HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD2HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$771.PFNGLMULTITEXCOORD2HVNVPROC$FUNC, false
    );
}


