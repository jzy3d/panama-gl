// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$280 {

    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$280.PFNGLNAMEDFRAMEBUFFERREADBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$280.PFNGLINVALIDATENAMEDFRAMEBUFFERDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;IIII)V",
        constants$280.PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$FUNC, false
    );
}


