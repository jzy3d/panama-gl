// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$350 {

    static final FunctionDescriptor DescribePixelFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DescribePixelFormat$MH = RuntimeHelper.downcallHandle(
        "DescribePixelFormat",
        constants$350.DescribePixelFormat$FUNC, false
    );
    static final FunctionDescriptor LPFNDEVMODE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LPFNDEVMODE$MH = RuntimeHelper.downcallHandle(
        constants$350.LPFNDEVMODE$FUNC, false
    );
    static final FunctionDescriptor LPFNDEVCAPS$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFNDEVCAPS$MH = RuntimeHelper.downcallHandle(
        constants$350.LPFNDEVCAPS$FUNC, false
    );
    static final FunctionDescriptor DeviceCapabilitiesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceCapabilitiesA$MH = RuntimeHelper.downcallHandle(
        "DeviceCapabilitiesA",
        constants$350.DeviceCapabilitiesA$FUNC, false
    );
}


