// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$882 {

    static final FunctionDescriptor PFNGLGETPATHPARAMETERFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPATHPARAMETERFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$882.PFNGLGETPATHPARAMETERFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPATHCOMMANDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPATHCOMMANDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$882.PFNGLGETPATHCOMMANDSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPATHCOORDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPATHCOORDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$882.PFNGLGETPATHCOORDSNVPROC$FUNC, false
    );
}


