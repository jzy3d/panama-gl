// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$401 {

    static final FunctionDescriptor PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJ)V",
        constants$401.PFNGLPROGRAMUNIFORMHANDLEUI64ARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$401.PFNGLPROGRAMUNIFORMHANDLEUI64VARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISTEXTUREHANDLERESIDENTARBPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_LONG
    );
    static final MethodHandle PFNGLISTEXTUREHANDLERESIDENTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(J)B",
        constants$401.PFNGLISTEXTUREHANDLERESIDENTARBPROC$FUNC, false
    );
}


