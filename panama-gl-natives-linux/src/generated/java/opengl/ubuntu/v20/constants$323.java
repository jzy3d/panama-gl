// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$323 {

    static final FunctionDescriptor PFNGLPROGRAMSTRINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$323.PFNGLPROGRAMSTRINGARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDPROGRAMARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDPROGRAMARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$323.PFNGLBINDPROGRAMARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEPROGRAMSARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEPROGRAMSARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$323.PFNGLDELETEPROGRAMSARBPROC$FUNC, false
    );
}


