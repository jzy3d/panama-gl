// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$483 {

    static final FunctionDescriptor PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$483.PFNGLDISABLEVERTEXATTRIBARRAYARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBDVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBDVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$483.PFNGLGETVERTEXATTRIBDVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBFVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBFVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$483.PFNGLGETVERTEXATTRIBFVARBPROC$FUNC, false
    );
}


