// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$88 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD3SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD3SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSS)V",
        constants$88.PFNGLMULTITEXCOORD3SARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD3SVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD3SVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$88.PFNGLMULTITEXCOORD3SVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD4DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLMULTITEXCOORD4DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDDD)V",
        constants$88.PFNGLMULTITEXCOORD4DARBPROC$FUNC, false
    );
}


