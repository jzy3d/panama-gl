// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$69 {

    static final FunctionDescriptor XDestroyIC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XDestroyIC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDestroyIC",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$69.XDestroyIC$FUNC, false
    );
    static final FunctionDescriptor XSetICFocus$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XSetICFocus$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XSetICFocus",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$69.XSetICFocus$FUNC, false
    );
    static final FunctionDescriptor XUnsetICFocus$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XUnsetICFocus$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XUnsetICFocus",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$69.XUnsetICFocus$FUNC, false
    );
    static final FunctionDescriptor XwcResetIC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XwcResetIC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XwcResetIC",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$69.XwcResetIC$FUNC, false
    );
    static final FunctionDescriptor XmbResetIC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle XmbResetIC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XmbResetIC",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$69.XmbResetIC$FUNC, false
    );
    static final FunctionDescriptor Xutf8ResetIC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle Xutf8ResetIC$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "Xutf8ResetIC",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$69.Xutf8ResetIC$FUNC, false
    );
}


