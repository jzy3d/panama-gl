// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$397 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBPOINTERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBPOINTERARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBILjdk/incubator/foreign/MemoryAddress;)V",
        constants$397.PFNGLVERTEXATTRIBPOINTERARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENABLEVERTEXATTRIBARRAYARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENABLEVERTEXATTRIBARRAYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$397.PFNGLENABLEVERTEXATTRIBARRAYARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$397.PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$FUNC, false
    );
}


