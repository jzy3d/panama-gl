// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$557 {

    static final FunctionDescriptor PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IBIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$557.PFNGLSELECTPERFMONITORCOUNTERSAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBEGINPERFMONITORAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBEGINPERFMONITORAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$557.PFNGLBEGINPERFMONITORAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDPERFMONITORAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENDPERFMONITORAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$557.PFNGLENDPERFMONITORAMDPROC$FUNC, false
    );
}

