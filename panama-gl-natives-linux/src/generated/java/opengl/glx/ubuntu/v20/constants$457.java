// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$457 {

    static final FunctionDescriptor PFNGLISNAMEDSTRINGARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLISNAMEDSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)B",
        constants$457.PFNGLISNAMEDSTRINGARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDSTRINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$457.PFNGLGETNAMEDSTRINGARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDSTRINGIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDSTRINGIVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$457.PFNGLGETNAMEDSTRINGIVARBPROC$FUNC, false
    );
}


