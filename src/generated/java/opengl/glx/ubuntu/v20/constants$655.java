// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$655 {

    static final FunctionDescriptor PFNGLMATRIXMULTTRANSPOSEDEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMATRIXMULTTRANSPOSEDEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$655.PFNGLMATRIXMULTTRANSPOSEDEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDBUFFERDATAEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDBUFFERDATAEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$655.PFNGLNAMEDBUFFERDATAEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDBUFFERSUBDATAEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDBUFFERSUBDATAEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$655.PFNGLNAMEDBUFFERSUBDATAEXTPROC$FUNC, false
    );
}


