// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$327 {

    static final FunctionDescriptor PFNGLGETPROGRAMPIPELINEINFOLOGPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMPIPELINEINFOLOGPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$327.PFNGLGETPROGRAMPIPELINEINFOLOGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL1DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIBL1DPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$327.PFNGLVERTEXATTRIBL1DPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL2DPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIBL2DPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$327.PFNGLVERTEXATTRIBL2DPROC$FUNC, false
    );
}


