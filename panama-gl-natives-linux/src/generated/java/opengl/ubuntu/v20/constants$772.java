// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$772 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD3HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD3HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSS)V",
        constants$772.PFNGLMULTITEXCOORD3HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD3HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD3HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$772.PFNGLMULTITEXCOORD3HVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD4HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD4HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$772.PFNGLMULTITEXCOORD4HNVPROC$FUNC, false
    );
}


