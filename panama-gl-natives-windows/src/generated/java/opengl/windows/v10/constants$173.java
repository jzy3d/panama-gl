// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$173 {

    static final FunctionDescriptor CancelWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "CancelWaitableTimer",
        constants$173.CancelWaitableTimer$FUNC, false
    );
    static final FunctionDescriptor CreateMutexExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExA$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExA",
        constants$173.CreateMutexExA$FUNC, false
    );
    static final FunctionDescriptor CreateMutexExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExW$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExW",
        constants$173.CreateMutexExW$FUNC, false
    );
    static final FunctionDescriptor CreateEventExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateEventExA$MH = RuntimeHelper.downcallHandle(
        "CreateEventExA",
        constants$173.CreateEventExA$FUNC, false
    );
    static final FunctionDescriptor CreateEventExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateEventExW$MH = RuntimeHelper.downcallHandle(
        "CreateEventExW",
        constants$173.CreateEventExW$FUNC, false
    );
    static final FunctionDescriptor CreateSemaphoreExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSemaphoreExW$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreExW",
        constants$173.CreateSemaphoreExW$FUNC, false
    );
}


