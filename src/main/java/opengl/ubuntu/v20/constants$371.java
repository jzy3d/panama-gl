// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$371 {

    static final FunctionDescriptor PFNGLDELETENAMEDSTRINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETENAMEDSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$371.PFNGLDELETENAMEDSTRINGARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPILESHADERINCLUDEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPILESHADERINCLUDEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$371.PFNGLCOMPILESHADERINCLUDEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISNAMEDSTRINGARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLISNAMEDSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)B",
        constants$371.PFNGLISNAMEDSTRINGARBPROC$FUNC, false
    );
}


