// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$179 {

    static final FunctionDescriptor OpenThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenThread$MH = RuntimeHelper.downcallHandle(
        "OpenThread",
        constants$179.OpenThread$FUNC, false
    );
    static final FunctionDescriptor SetThreadPriority$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadPriority$MH = RuntimeHelper.downcallHandle(
        "SetThreadPriority",
        constants$179.SetThreadPriority$FUNC, false
    );
    static final FunctionDescriptor SetThreadPriorityBoost$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadPriorityBoost$MH = RuntimeHelper.downcallHandle(
        "SetThreadPriorityBoost",
        constants$179.SetThreadPriorityBoost$FUNC, false
    );
    static final FunctionDescriptor GetThreadPriorityBoost$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadPriorityBoost$MH = RuntimeHelper.downcallHandle(
        "GetThreadPriorityBoost",
        constants$179.GetThreadPriorityBoost$FUNC, false
    );
    static final FunctionDescriptor GetThreadPriority$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadPriority$MH = RuntimeHelper.downcallHandle(
        "GetThreadPriority",
        constants$179.GetThreadPriority$FUNC, false
    );
    static final FunctionDescriptor ExitThread$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitThread$MH = RuntimeHelper.downcallHandle(
        "ExitThread",
        constants$179.ExitThread$FUNC, false
    );
}


