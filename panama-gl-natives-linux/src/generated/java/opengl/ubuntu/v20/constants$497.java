// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$497 {

    static final FunctionDescriptor PFNGLGETOBJECTBUFFERIVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETOBJECTBUFFERIVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$497.PFNGLGETOBJECTBUFFERIVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFREEOBJECTBUFFERATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFREEOBJECTBUFFERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$497.PFNGLFREEOBJECTBUFFERATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLARRAYOBJECTATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLARRAYOBJECTATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$497.PFNGLARRAYOBJECTATIPROC$FUNC, false
    );
}


