// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$568 {

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
        constants$568.PFNGLCOMPRESSEDMULTITEXSUBIMAGE1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$568.PFNGLGETCOMPRESSEDMULTITEXIMAGEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMATRIXLOADTRANSPOSEFEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMATRIXLOADTRANSPOSEFEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$568.PFNGLMATRIXLOADTRANSPOSEFEXTPROC$FUNC, false
    );
}


