// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$431 {

    static final FunctionDescriptor RegisterClassA$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassA$MH = RuntimeHelper.downcallHandle(
        "RegisterClassA",
        constants$431.RegisterClassA$FUNC, false
    );
    static final FunctionDescriptor RegisterClassW$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterClassW$MH = RuntimeHelper.downcallHandle(
        "RegisterClassW",
        constants$431.RegisterClassW$FUNC, false
    );
    static final FunctionDescriptor UnregisterClassA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterClassA$MH = RuntimeHelper.downcallHandle(
        "UnregisterClassA",
        constants$431.UnregisterClassA$FUNC, false
    );
    static final FunctionDescriptor UnregisterClassW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterClassW$MH = RuntimeHelper.downcallHandle(
        "UnregisterClassW",
        constants$431.UnregisterClassW$FUNC, false
    );
    static final FunctionDescriptor GetClassInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoA$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoA",
        constants$431.GetClassInfoA$FUNC, false
    );
    static final FunctionDescriptor GetClassInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassInfoW$MH = RuntimeHelper.downcallHandle(
        "GetClassInfoW",
        constants$431.GetClassInfoW$FUNC, false
    );
}


