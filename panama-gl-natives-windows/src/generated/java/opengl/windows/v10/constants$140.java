// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$140 {

    static final FunctionDescriptor GetFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileTime$MH = RuntimeHelper.downcallHandle(
        "GetFileTime",
        constants$140.GetFileTime$FUNC, false
    );
    static final FunctionDescriptor GetFullPathNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameW$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameW",
        constants$140.GetFullPathNameW$FUNC, false
    );
    static final FunctionDescriptor GetFullPathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFullPathNameA$MH = RuntimeHelper.downcallHandle(
        "GetFullPathNameA",
        constants$140.GetFullPathNameA$FUNC, false
    );
    static final FunctionDescriptor GetLogicalDrives$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetLogicalDrives$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDrives",
        constants$140.GetLogicalDrives$FUNC, false
    );
    static final FunctionDescriptor GetLogicalDriveStringsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLogicalDriveStringsW$MH = RuntimeHelper.downcallHandle(
        "GetLogicalDriveStringsW",
        constants$140.GetLogicalDriveStringsW$FUNC, false
    );
    static final FunctionDescriptor GetLongPathNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLongPathNameA$MH = RuntimeHelper.downcallHandle(
        "GetLongPathNameA",
        constants$140.GetLongPathNameA$FUNC, false
    );
}


