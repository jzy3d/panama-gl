// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$95 {

    static final FunctionDescriptor PFNGLFOGCOORDPOINTERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLFOGCOORDPOINTERPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$95.PFNGLFOGCOORDPOINTERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3BPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3BPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$95.PFNGLSECONDARYCOLOR3BPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3BVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3BVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$95.PFNGLSECONDARYCOLOR3BVPROC$FUNC, false
    );
}


