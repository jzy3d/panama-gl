// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$334 {

    static final FunctionDescriptor GetNumaAvailableMemoryNodeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaAvailableMemoryNodeEx$MH = RuntimeHelper.downcallHandle(
        "GetNumaAvailableMemoryNodeEx",
        constants$334.GetNumaAvailableMemoryNodeEx$FUNC, false
    );
    static final FunctionDescriptor GetNumaProximityNode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProximityNode$MH = RuntimeHelper.downcallHandle(
        "GetNumaProximityNode",
        constants$334.GetNumaProximityNode$FUNC, false
    );
    static final FunctionDescriptor APPLICATION_RECOVERY_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle APPLICATION_RECOVERY_CALLBACK$MH = RuntimeHelper.downcallHandle(
        constants$334.APPLICATION_RECOVERY_CALLBACK$FUNC, false
    );
    static final FunctionDescriptor RegisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "RegisterApplicationRecoveryCallback",
        constants$334.RegisterApplicationRecoveryCallback$FUNC, false
    );
    static final FunctionDescriptor UnregisterApplicationRecoveryCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle UnregisterApplicationRecoveryCallback$MH = RuntimeHelper.downcallHandle(
        "UnregisterApplicationRecoveryCallback",
        constants$334.UnregisterApplicationRecoveryCallback$FUNC, false
    );
}


