// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$324 {

    static final FunctionDescriptor SystemTimeToTzSpecificLocalTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToTzSpecificLocalTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToTzSpecificLocalTime",
        constants$324.SystemTimeToTzSpecificLocalTime$FUNC, false
    );
    static final FunctionDescriptor TzSpecificLocalTimeToSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TzSpecificLocalTimeToSystemTime$MH = RuntimeHelper.downcallHandle(
        "TzSpecificLocalTimeToSystemTime",
        constants$324.TzSpecificLocalTimeToSystemTime$FUNC, false
    );
    static final FunctionDescriptor FileTimeToSystemTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FileTimeToSystemTime$MH = RuntimeHelper.downcallHandle(
        "FileTimeToSystemTime",
        constants$324.FileTimeToSystemTime$FUNC, false
    );
    static final FunctionDescriptor SystemTimeToFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SystemTimeToFileTime$MH = RuntimeHelper.downcallHandle(
        "SystemTimeToFileTime",
        constants$324.SystemTimeToFileTime$FUNC, false
    );
    static final FunctionDescriptor GetTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "GetTimeZoneInformation",
        constants$324.GetTimeZoneInformation$FUNC, false
    );
    static final FunctionDescriptor SetTimeZoneInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetTimeZoneInformation$MH = RuntimeHelper.downcallHandle(
        "SetTimeZoneInformation",
        constants$324.SetTimeZoneInformation$FUNC, false
    );
}


