// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$372 {

    static final FunctionDescriptor PFNGLGETNAMEDSTRINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDSTRINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$372.PFNGLGETNAMEDSTRINGARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDSTRINGIVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDSTRINGIVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$372.PFNGLGETNAMEDSTRINGIVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBUFFERPAGECOMMITMENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_CHAR
    );
    static final MethodHandle PFNGLBUFFERPAGECOMMITMENTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJB)V",
        constants$372.PFNGLBUFFERPAGECOMMITMENTARBPROC$FUNC, false
    );
}

