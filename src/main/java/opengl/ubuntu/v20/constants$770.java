// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$770 {

    static final FunctionDescriptor PFNGLTEXCOORD4HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLTEXCOORD4HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(SSSS)V",
        constants$770.PFNGLTEXCOORD4HNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXCOORD4HVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLTEXCOORD4HVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$770.PFNGLTEXCOORD4HVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD1HNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD1HNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IS)V",
        constants$770.PFNGLMULTITEXCOORD1HNVPROC$FUNC, false
    );
}


