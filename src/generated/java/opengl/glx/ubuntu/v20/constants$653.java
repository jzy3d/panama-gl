// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$653 {

    static final FunctionDescriptor PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$653.PFNGLCOMPRESSEDMULTITEXSUBIMAGE2DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$653.PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$653.PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC$FUNC, false
    );
}


