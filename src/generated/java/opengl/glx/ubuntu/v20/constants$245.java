// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$245 {

    static final FunctionDescriptor PFNGLGETFRAGDATALOCATIONPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAGDATALOCATIONPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$245.PFNGLGETFRAGDATALOCATIONPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM1UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM1UIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$245.PFNGLUNIFORM1UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM2UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORM2UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$245.PFNGLUNIFORM2UIPROC$FUNC, false
    );
}


