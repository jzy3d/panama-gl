// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$729 {

    static final FunctionDescriptor glutTabletMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutTabletMotionFunc$MH = RuntimeHelper.downcallHandle(
        "glutTabletMotionFunc",
        constants$729.glutTabletMotionFunc$FUNC, false
    );
    static final FunctionDescriptor glutTabletButtonFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutTabletButtonFunc$callback$MH = RuntimeHelper.downcallHandle(
        constants$729.glutTabletButtonFunc$callback$FUNC, false
    );
    static final FunctionDescriptor glutTabletButtonFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutTabletButtonFunc$MH = RuntimeHelper.downcallHandle(
        "glutTabletButtonFunc",
        constants$729.glutTabletButtonFunc$FUNC, false
    );
    static final FunctionDescriptor glutGet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutGet$MH = RuntimeHelper.downcallHandle(
        "glutGet",
        constants$729.glutGet$FUNC, false
    );
    static final FunctionDescriptor glutDeviceGet$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glutDeviceGet$MH = RuntimeHelper.downcallHandle(
        "glutDeviceGet",
        constants$729.glutDeviceGet$FUNC, false
    );
}


