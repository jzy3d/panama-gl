// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$718 {

    static final FunctionDescriptor PFNGLGETFRAGDATALOCATIONEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAGDATALOCATIONEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$718.PFNGLGETFRAGDATALOCATIONEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM1UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$718.PFNGLUNIFORM1UIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM2UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$718.PFNGLUNIFORM2UIEXTPROC$FUNC, false
    );
}


