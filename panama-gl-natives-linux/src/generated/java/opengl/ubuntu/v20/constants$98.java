// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$98 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3SPROC$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3SPROC$MH = RuntimeHelper.downcallHandle(
        "(SSS)V",
        constants$98.PFNGLSECONDARYCOLOR3SPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3SVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3SVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$98.PFNGLSECONDARYCOLOR3SVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$98.PFNGLSECONDARYCOLOR3UBPROC$FUNC, false
    );
}


