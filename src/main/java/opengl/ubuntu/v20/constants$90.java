// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$90 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD4IARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORD4IARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$90.PFNGLMULTITEXCOORD4IARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD4IVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD4IVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$90.PFNGLMULTITEXCOORD4IVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD4SARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle PFNGLMULTITEXCOORD4SARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ISSSS)V",
        constants$90.PFNGLMULTITEXCOORD4SARBPROC$FUNC, false
    );
}

