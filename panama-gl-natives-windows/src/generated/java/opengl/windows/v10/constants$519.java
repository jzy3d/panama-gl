// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$519 {

    static final FunctionDescriptor MonitorFromWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MonitorFromWindow$MH = RuntimeHelper.downcallHandle(
        "MonitorFromWindow",
        constants$519.MonitorFromWindow$FUNC, false
    );
    static final FunctionDescriptor GetMonitorInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMonitorInfoA$MH = RuntimeHelper.downcallHandle(
        "GetMonitorInfoA",
        constants$519.GetMonitorInfoA$FUNC, false
    );
    static final FunctionDescriptor GetMonitorInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMonitorInfoW$MH = RuntimeHelper.downcallHandle(
        "GetMonitorInfoW",
        constants$519.GetMonitorInfoW$FUNC, false
    );
    static final FunctionDescriptor MONITORENUMPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MONITORENUMPROC$MH = RuntimeHelper.downcallHandle(
        constants$519.MONITORENUMPROC$FUNC, false
    );
    static final FunctionDescriptor EnumDisplayMonitors$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDisplayMonitors$MH = RuntimeHelper.downcallHandle(
        "EnumDisplayMonitors",
        constants$519.EnumDisplayMonitors$FUNC, false
    );
}


