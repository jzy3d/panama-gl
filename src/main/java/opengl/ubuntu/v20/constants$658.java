// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$658 {

    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$658.PFNGLSECONDARYCOLOR3UBEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UBVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UBVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$658.PFNGLSECONDARYCOLOR3UBVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$658.PFNGLSECONDARYCOLOR3UIEXTPROC$FUNC, false
    );
}


