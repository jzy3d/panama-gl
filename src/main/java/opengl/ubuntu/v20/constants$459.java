// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$459 {

    static final FunctionDescriptor PFNGLUNIFORM3UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLUNIFORM3UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJJ)V",
        constants$459.PFNGLUNIFORM3UI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4UI64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLUNIFORM4UI64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJJJ)V",
        constants$459.PFNGLUNIFORM4UI64NVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1UI64VNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1UI64VNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$459.PFNGLUNIFORM1UI64VNVPROC$FUNC, false
    );
}

