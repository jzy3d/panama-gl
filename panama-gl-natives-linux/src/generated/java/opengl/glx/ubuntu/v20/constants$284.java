// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$284 {

    static final FunctionDescriptor PFNGLMULTITEXCOORDP1UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORDP1UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$284.PFNGLMULTITEXCOORDP1UIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORDP1UIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORDP1UIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$284.PFNGLMULTITEXCOORDP1UIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORDP2UIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXCOORDP2UIPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$284.PFNGLMULTITEXCOORDP2UIPROC$FUNC, false
    );
}


