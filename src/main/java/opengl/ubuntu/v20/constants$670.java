// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$670 {

    static final FunctionDescriptor PFNGLCLEARCOLORIUIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCLEARCOLORIUIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$670.PFNGLCLEARCOLORIUIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLARETEXTURESRESIDENTEXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLARETEXTURESRESIDENTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)B",
        constants$670.PFNGLARETEXTURESRESIDENTEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDTEXTUREEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDTEXTUREEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$670.PFNGLBINDTEXTUREEXTPROC$FUNC, false
    );
}

