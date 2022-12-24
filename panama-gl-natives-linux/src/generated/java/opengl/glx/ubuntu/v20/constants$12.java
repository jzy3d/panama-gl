// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$12 {

    static final FunctionDescriptor XDisplayMotionBufferSize$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle XDisplayMotionBufferSize$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XDisplayMotionBufferSize",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$12.XDisplayMotionBufferSize$FUNC, false
    );
    static final FunctionDescriptor XVisualIDFromVisual$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle XVisualIDFromVisual$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XVisualIDFromVisual",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$12.XVisualIDFromVisual$FUNC, false
    );
    static final FunctionDescriptor XInitThreads$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle XInitThreads$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XInitThreads",
        "()I",
        constants$12.XInitThreads$FUNC, false
    );
    static final FunctionDescriptor XLockDisplay$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XLockDisplay$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XLockDisplay",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$12.XLockDisplay$FUNC, false
    );
    static final FunctionDescriptor XUnlockDisplay$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle XUnlockDisplay$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XUnlockDisplay",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$12.XUnlockDisplay$FUNC, false
    );
    static final FunctionDescriptor XInitExtension$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XInitExtension$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "XInitExtension",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$12.XInitExtension$FUNC, false
    );
}

