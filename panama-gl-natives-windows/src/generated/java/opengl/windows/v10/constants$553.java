// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$553 {

    static final FunctionDescriptor SetProcessPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "SetProcessPreferredUILanguages",
        constants$553.SetProcessPreferredUILanguages$FUNC, false
    );
    static final FunctionDescriptor GetUserPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUserPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "GetUserPreferredUILanguages",
        constants$553.GetUserPreferredUILanguages$FUNC, false
    );
    static final FunctionDescriptor GetSystemPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "GetSystemPreferredUILanguages",
        constants$553.GetSystemPreferredUILanguages$FUNC, false
    );
    static final FunctionDescriptor GetThreadPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "GetThreadPreferredUILanguages",
        constants$553.GetThreadPreferredUILanguages$FUNC, false
    );
    static final FunctionDescriptor SetThreadPreferredUILanguages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadPreferredUILanguages$MH = RuntimeHelper.downcallHandle(
        "SetThreadPreferredUILanguages",
        constants$553.SetThreadPreferredUILanguages$FUNC, false
    );
    static final FunctionDescriptor GetFileMUIInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFileMUIInfo$MH = RuntimeHelper.downcallHandle(
        "GetFileMUIInfo",
        constants$553.GetFileMUIInfo$FUNC, false
    );
}


