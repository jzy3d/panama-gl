// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$252 {

    static final FunctionDescriptor ConvertPerformanceCounterToAuxiliaryCounter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConvertPerformanceCounterToAuxiliaryCounter$MH = RuntimeHelper.downcallHandle(
        "ConvertPerformanceCounterToAuxiliaryCounter",
        constants$252.ConvertPerformanceCounterToAuxiliaryCounter$FUNC, false
    );
    static final FunctionDescriptor PFIBER_START_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFIBER_START_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$252.PFIBER_START_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor LPFIBER_START_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFIBER_START_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$252.LPFIBER_START_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor PFIBER_CALLOUT_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


