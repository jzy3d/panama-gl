// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$504 {

    static final FunctionDescriptor IsGUIThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsGUIThread$MH = RuntimeHelper.downcallHandle(
        "IsGUIThread",
        constants$504.IsGUIThread$FUNC, false
    );
    static final FunctionDescriptor GetLastActivePopup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLastActivePopup$MH = RuntimeHelper.downcallHandle(
        "GetLastActivePopup",
        constants$504.GetLastActivePopup$FUNC, false
    );
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindow$MH = RuntimeHelper.downcallHandle(
        "GetWindow",
        constants$504.GetWindow$FUNC, false
    );
    static final FunctionDescriptor SetWindowsHookA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowsHookA$MH = RuntimeHelper.downcallHandle(
        "SetWindowsHookA",
        constants$504.SetWindowsHookA$FUNC, false
    );
    static final FunctionDescriptor SetWindowsHookW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowsHookW$MH = RuntimeHelper.downcallHandle(
        "SetWindowsHookW",
        constants$504.SetWindowsHookW$FUNC, false
    );
    static final FunctionDescriptor UnhookWindowsHook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnhookWindowsHook$MH = RuntimeHelper.downcallHandle(
        "UnhookWindowsHook",
        constants$504.UnhookWindowsHook$FUNC, false
    );
}


