// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$719 {

    static final FunctionDescriptor PFNGLUNIFORM3UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM3UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$719.PFNGLUNIFORM3UIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4UIEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM4UIEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$719.PFNGLUNIFORM4UIEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1UIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORM1UIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$719.PFNGLUNIFORM1UIVEXTPROC$FUNC, false
    );
}

