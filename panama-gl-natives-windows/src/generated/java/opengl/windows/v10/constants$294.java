// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$294 {

    static final FunctionDescriptor WritePrivateProfileStructW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WritePrivateProfileStructW$MH = RuntimeHelper.downcallHandle(
        "WritePrivateProfileStructW",
        constants$294.WritePrivateProfileStructW$FUNC, false
    );
    static final FunctionDescriptor Wow64EnableWow64FsRedirection$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle Wow64EnableWow64FsRedirection$MH = RuntimeHelper.downcallHandle(
        "Wow64EnableWow64FsRedirection",
        constants$294.Wow64EnableWow64FsRedirection$FUNC, false
    );
    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PGET_SYSTEM_WOW64_DIRECTORY_A$MH = RuntimeHelper.downcallHandle(
        constants$294.PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC, false
    );
    static final FunctionDescriptor PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PGET_SYSTEM_WOW64_DIRECTORY_W$MH = RuntimeHelper.downcallHandle(
        constants$294.PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC, false
    );
}


