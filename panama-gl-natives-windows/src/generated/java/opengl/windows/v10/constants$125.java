// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$125 {

    static final FunctionDescriptor PTP_TIMER_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_TIMER_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$125.PTP_TIMER_CALLBACK$FUNC, false
    );
    static final FunctionDescriptor PTP_WAIT_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PTP_WAIT_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$125.PTP_WAIT_CALLBACK$FUNC, false
    );
    static final FunctionDescriptor NtCurrentTeb$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle NtCurrentTeb$MH = RuntimeHelper.downcallHandle(
        "NtCurrentTeb",
        constants$125.NtCurrentTeb$FUNC, false
    );
    static final FunctionDescriptor GetCurrentFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCurrentFiber$MH = RuntimeHelper.downcallHandle(
        "GetCurrentFiber",
        constants$125.GetCurrentFiber$FUNC, false
    );
    static final FunctionDescriptor GetFiberData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetFiberData$MH = RuntimeHelper.downcallHandle(
        "GetFiberData",
        constants$125.GetFiberData$FUNC, false
    );
}


