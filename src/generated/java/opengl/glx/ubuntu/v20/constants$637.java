// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$637 {

    static final FunctionDescriptor PFNGLMULTITEXGENIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXGENIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$637.PFNGLMULTITEXGENIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXGENIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXGENIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$637.PFNGLMULTITEXGENIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETMULTITEXENVFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMULTITEXENVFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$637.PFNGLGETMULTITEXENVFVEXTPROC$FUNC, false
    );
}


