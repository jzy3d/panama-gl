// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$492 {

    static final FunctionDescriptor ShowCaret$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShowCaret$MH = RuntimeHelper.downcallHandle(
        "ShowCaret",
        constants$492.ShowCaret$FUNC, false
    );
    static final FunctionDescriptor SetCaretPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCaretPos$MH = RuntimeHelper.downcallHandle(
        "SetCaretPos",
        constants$492.SetCaretPos$FUNC, false
    );
    static final FunctionDescriptor GetCaretPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCaretPos$MH = RuntimeHelper.downcallHandle(
        "GetCaretPos",
        constants$492.GetCaretPos$FUNC, false
    );
    static final FunctionDescriptor ClientToScreen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClientToScreen$MH = RuntimeHelper.downcallHandle(
        "ClientToScreen",
        constants$492.ClientToScreen$FUNC, false
    );
    static final FunctionDescriptor ScreenToClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScreenToClient$MH = RuntimeHelper.downcallHandle(
        "ScreenToClient",
        constants$492.ScreenToClient$FUNC, false
    );
    static final FunctionDescriptor LogicalToPhysicalPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LogicalToPhysicalPoint$MH = RuntimeHelper.downcallHandle(
        "LogicalToPhysicalPoint",
        constants$492.LogicalToPhysicalPoint$FUNC, false
    );
}


