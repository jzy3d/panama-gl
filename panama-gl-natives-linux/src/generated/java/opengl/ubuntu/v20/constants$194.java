// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$194 {

    static final FunctionDescriptor PFNGLVERTEXP2UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXP2UIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$194.PFNGLVERTEXP2UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXP2UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXP2UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$194.PFNGLVERTEXP2UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXP3UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXP3UIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$194.PFNGLVERTEXP3UIPROC$FUNC, false
    );
}


