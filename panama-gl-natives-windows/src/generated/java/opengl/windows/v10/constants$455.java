// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$455 {

    static final FunctionDescriptor OemKeyScan$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle OemKeyScan$MH = RuntimeHelper.downcallHandle(
        "OemKeyScan",
        constants$455.OemKeyScan$FUNC, false
    );
    static final FunctionDescriptor VkKeyScanA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle VkKeyScanA$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanA",
        constants$455.VkKeyScanA$FUNC, false
    );
    static final FunctionDescriptor VkKeyScanW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle VkKeyScanW$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanW",
        constants$455.VkKeyScanW$FUNC, false
    );
    static final FunctionDescriptor VkKeyScanExA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VkKeyScanExA$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanExA",
        constants$455.VkKeyScanExA$FUNC, false
    );
    static final FunctionDescriptor VkKeyScanExW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VkKeyScanExW$MH = RuntimeHelper.downcallHandle(
        "VkKeyScanExW",
        constants$455.VkKeyScanExW$FUNC, false
    );
    static final FunctionDescriptor keybd_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle keybd_event$MH = RuntimeHelper.downcallHandle(
        "keybd_event",
        constants$455.keybd_event$FUNC, false
    );
}


