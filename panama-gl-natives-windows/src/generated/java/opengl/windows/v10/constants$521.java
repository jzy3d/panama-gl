// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$521 {

    static final FunctionDescriptor GetGUIThreadInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGUIThreadInfo$MH = RuntimeHelper.downcallHandle(
        "GetGUIThreadInfo",
        constants$521.GetGUIThreadInfo$FUNC, false
    );
    static final FunctionDescriptor BlockInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle BlockInput$MH = RuntimeHelper.downcallHandle(
        "BlockInput",
        constants$521.BlockInput$FUNC, false
    );
    static final FunctionDescriptor SetProcessDPIAware$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SetProcessDPIAware$MH = RuntimeHelper.downcallHandle(
        "SetProcessDPIAware",
        constants$521.SetProcessDPIAware$FUNC, false
    );
    static final FunctionDescriptor IsProcessDPIAware$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsProcessDPIAware$MH = RuntimeHelper.downcallHandle(
        "IsProcessDPIAware",
        constants$521.IsProcessDPIAware$FUNC, false
    );
    static final FunctionDescriptor SetThreadDpiAwarenessContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadDpiAwarenessContext$MH = RuntimeHelper.downcallHandle(
        "SetThreadDpiAwarenessContext",
        constants$521.SetThreadDpiAwarenessContext$FUNC, false
    );
    static final FunctionDescriptor GetThreadDpiAwarenessContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetThreadDpiAwarenessContext$MH = RuntimeHelper.downcallHandle(
        "GetThreadDpiAwarenessContext",
        constants$521.GetThreadDpiAwarenessContext$FUNC, false
    );
}


