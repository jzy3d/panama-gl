// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$517 {

    static final FunctionDescriptor DisplayConfigGetDeviceInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisplayConfigGetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        "DisplayConfigGetDeviceInfo",
        constants$517.DisplayConfigGetDeviceInfo$FUNC, false
    );
    static final FunctionDescriptor DisplayConfigSetDeviceInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisplayConfigSetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        "DisplayConfigSetDeviceInfo",
        constants$517.DisplayConfigSetDeviceInfo$FUNC, false
    );
    static final FunctionDescriptor SystemParametersInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SystemParametersInfoA$MH = RuntimeHelper.downcallHandle(
        "SystemParametersInfoA",
        constants$517.SystemParametersInfoA$FUNC, false
    );
    static final FunctionDescriptor SystemParametersInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SystemParametersInfoW$MH = RuntimeHelper.downcallHandle(
        "SystemParametersInfoW",
        constants$517.SystemParametersInfoW$FUNC, false
    );
    static final FunctionDescriptor SystemParametersInfoForDpi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SystemParametersInfoForDpi$MH = RuntimeHelper.downcallHandle(
        "SystemParametersInfoForDpi",
        constants$517.SystemParametersInfoForDpi$FUNC, false
    );
    static final FunctionDescriptor SoundSentry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SoundSentry$MH = RuntimeHelper.downcallHandle(
        "SoundSentry",
        constants$517.SoundSentry$FUNC, false
    );
}


