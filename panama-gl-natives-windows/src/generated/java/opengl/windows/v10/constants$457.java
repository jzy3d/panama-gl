// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$457 {

    static final FunctionDescriptor IsTouchWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsTouchWindow$MH = RuntimeHelper.downcallHandle(
        "IsTouchWindow",
        constants$457.IsTouchWindow$FUNC, false
    );
    static final FunctionDescriptor InitializeTouchInjection$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InitializeTouchInjection$MH = RuntimeHelper.downcallHandle(
        "InitializeTouchInjection",
        constants$457.InitializeTouchInjection$FUNC, false
    );
    static final FunctionDescriptor InjectTouchInput$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InjectTouchInput$MH = RuntimeHelper.downcallHandle(
        "InjectTouchInput",
        constants$457.InjectTouchInput$FUNC, false
    );
    static final FunctionDescriptor GetPointerType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerType$MH = RuntimeHelper.downcallHandle(
        "GetPointerType",
        constants$457.GetPointerType$FUNC, false
    );
    static final FunctionDescriptor GetPointerCursorId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerCursorId$MH = RuntimeHelper.downcallHandle(
        "GetPointerCursorId",
        constants$457.GetPointerCursorId$FUNC, false
    );
    static final FunctionDescriptor GetPointerInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerInfo$MH = RuntimeHelper.downcallHandle(
        "GetPointerInfo",
        constants$457.GetPointerInfo$FUNC, false
    );
}


