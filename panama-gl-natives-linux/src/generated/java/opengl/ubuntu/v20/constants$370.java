// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$370 {

    static final FunctionDescriptor PFNGLGETUNIFORMIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNIFORMIVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$370.PFNGLGETUNIFORMIVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETSHADERSOURCEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETSHADERSOURCEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$370.PFNGLGETSHADERSOURCEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDSTRINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$370.PFNGLNAMEDSTRINGARBPROC$FUNC, false
    );
}


