// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$847 {

    static final FunctionDescriptor PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$847.PFNGLPROGRAMENVPARAMETERSI4UIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$847.PFNGLGETPROGRAMLOCALPARAMETERIIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$847.PFNGLGETPROGRAMLOCALPARAMETERIUIVNVPROC$FUNC, false
    );
}

