// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$788 {

    static final FunctionDescriptor PFNGLPATHSUBCOMMANDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHSUBCOMMANDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$788.PFNGLPATHSUBCOMMANDSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHSUBCOORDSNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHSUBCOORDSNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$788.PFNGLPATHSUBCOORDSNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHSTRINGNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHSTRINGNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$788.PFNGLPATHSTRINGNVPROC$FUNC, false
    );
}


