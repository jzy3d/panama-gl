// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$285 {

    static final FunctionDescriptor GetFirmwareType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFirmwareType$MH = RuntimeHelper.downcallHandle(
        "GetFirmwareType",
        constants$285.GetFirmwareType$FUNC, false
    );
    static final FunctionDescriptor IsNativeVhdBoot$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsNativeVhdBoot$MH = RuntimeHelper.downcallHandle(
        "IsNativeVhdBoot",
        constants$285.IsNativeVhdBoot$FUNC, false
    );
    static final FunctionDescriptor FindResourceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindResourceA$MH = RuntimeHelper.downcallHandle(
        "FindResourceA",
        constants$285.FindResourceA$FUNC, false
    );
    static final FunctionDescriptor FindResourceExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle FindResourceExA$MH = RuntimeHelper.downcallHandle(
        "FindResourceExA",
        constants$285.FindResourceExA$FUNC, false
    );
    static final FunctionDescriptor EnumResourceTypesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumResourceTypesA$MH = RuntimeHelper.downcallHandle(
        "EnumResourceTypesA",
        constants$285.EnumResourceTypesA$FUNC, false
    );
    static final FunctionDescriptor EnumResourceTypesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumResourceTypesW$MH = RuntimeHelper.downcallHandle(
        "EnumResourceTypesW",
        constants$285.EnumResourceTypesW$FUNC, false
    );
}


