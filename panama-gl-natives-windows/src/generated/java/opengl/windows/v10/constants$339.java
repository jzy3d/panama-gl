// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$339 {

    static final FunctionDescriptor DisableThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "DisableThreadProfiling",
        constants$339.DisableThreadProfiling$FUNC, false
    );
    static final FunctionDescriptor QueryThreadProfiling$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadProfiling$MH = RuntimeHelper.downcallHandle(
        "QueryThreadProfiling",
        constants$339.QueryThreadProfiling$FUNC, false
    );
    static final FunctionDescriptor ReadThreadProfilingData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadThreadProfilingData$MH = RuntimeHelper.downcallHandle(
        "ReadThreadProfilingData",
        constants$339.ReadThreadProfilingData$FUNC, false
    );
    static final FunctionDescriptor RaiseCustomSystemEventTrigger$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RaiseCustomSystemEventTrigger$MH = RuntimeHelper.downcallHandle(
        "RaiseCustomSystemEventTrigger",
        constants$339.RaiseCustomSystemEventTrigger$FUNC, false
    );
    static final FunctionDescriptor OLDFONTENUMPROCA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle OLDFONTENUMPROCA$MH = RuntimeHelper.downcallHandle(
        constants$339.OLDFONTENUMPROCA$FUNC, false
    );
}


