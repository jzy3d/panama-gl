// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$256 {

    static final FunctionDescriptor LocalReAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LocalReAlloc$MH = RuntimeHelper.downcallHandle(
        "LocalReAlloc",
        constants$256.LocalReAlloc$FUNC, false
    );
    static final FunctionDescriptor LocalLock$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalLock$MH = RuntimeHelper.downcallHandle(
        "LocalLock",
        constants$256.LocalLock$FUNC, false
    );
    static final FunctionDescriptor LocalHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalHandle$MH = RuntimeHelper.downcallHandle(
        "LocalHandle",
        constants$256.LocalHandle$FUNC, false
    );
    static final FunctionDescriptor LocalUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalUnlock$MH = RuntimeHelper.downcallHandle(
        "LocalUnlock",
        constants$256.LocalUnlock$FUNC, false
    );
    static final FunctionDescriptor LocalSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalSize$MH = RuntimeHelper.downcallHandle(
        "LocalSize",
        constants$256.LocalSize$FUNC, false
    );
    static final FunctionDescriptor LocalFlags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalFlags$MH = RuntimeHelper.downcallHandle(
        "LocalFlags",
        constants$256.LocalFlags$FUNC, false
    );
}


