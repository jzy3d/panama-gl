// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$206 {

    static final FunctionDescriptor PFNGLDRAWELEMENTSINDIRECTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDRAWELEMENTSINDIRECTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$206.PFNGLDRAWELEMENTSINDIRECTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLUNIFORM1DPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$206.PFNGLUNIFORM1DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLUNIFORM2DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$206.PFNGLUNIFORM2DPROC$FUNC, false
    );
}


