// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$366 {

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
        constants$366.PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARNAMEDFRAMEBUFFERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARNAMEDFRAMEBUFFERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$366.PFNGLCLEARNAMEDFRAMEBUFFERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$366.PFNGLCLEARNAMEDFRAMEBUFFERUIVPROC$FUNC, false
    );
}

