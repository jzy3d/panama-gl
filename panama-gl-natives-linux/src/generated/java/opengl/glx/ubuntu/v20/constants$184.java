// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$184 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$184.PFNGLSECONDARYCOLOR3UBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$184.PFNGLSECONDARYCOLOR3UBVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$184.PFNGLSECONDARYCOLOR3UIPROC$FUNC, false
    );
}


