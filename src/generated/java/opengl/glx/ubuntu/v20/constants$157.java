// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$157 {

    static final FunctionDescriptor PFNGLSAMPLECOVERAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_CHAR
    );
    static final MethodHandle PFNGLSAMPLECOVERAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(FB)V",
        constants$157.PFNGLSAMPLECOVERAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXIMAGE3DPROC$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle PFNGLCOMPRESSEDTEXIMAGE3DPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$157.PFNGLCOMPRESSEDTEXIMAGE3DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDTEXIMAGE2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDTEXIMAGE2DPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$157.PFNGLCOMPRESSEDTEXIMAGE2DPROC$FUNC, false
    );
}


