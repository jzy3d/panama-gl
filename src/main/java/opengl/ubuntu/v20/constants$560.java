// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$560 {

    static final FunctionDescriptor PFNGLMULTITEXSUBIMAGE3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXSUBIMAGE3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$560.PFNGLMULTITEXSUBIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIII)V",
        constants$560.PFNGLCOPYMULTITEXSUBIMAGE3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENABLECLIENTSTATEINDEXEDEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLENABLECLIENTSTATEINDEXEDEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$560.PFNGLENABLECLIENTSTATEINDEXEDEXTPROC$FUNC, false
    );
}


