// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$591 {

    static final FunctionDescriptor PFNGLGETPOINTERI_VEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPOINTERI_VEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$591.PFNGLGETPOINTERI_VEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDPROGRAMSTRINGEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDPROGRAMSTRINGEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$591.PFNGLNAMEDPROGRAMSTRINGEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIDDDD)V",
        constants$591.PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$FUNC, false
    );
}

