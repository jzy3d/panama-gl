// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$737 {

    static final FunctionDescriptor glutForceJoystickFunc$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutForceJoystickFunc$MH = RuntimeHelper.downcallHandle(
        "glutForceJoystickFunc",
        constants$737.glutForceJoystickFunc$FUNC, false
    );
    static final FunctionDescriptor glutExtensionSupported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glutExtensionSupported$MH = RuntimeHelper.downcallHandle(
        "glutExtensionSupported",
        constants$737.glutExtensionSupported$FUNC, false
    );
    static final FunctionDescriptor glutReportErrors$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutReportErrors$MH = RuntimeHelper.downcallHandle(
        "glutReportErrors",
        constants$737.glutReportErrors$FUNC, false
    );
    static final FunctionDescriptor _calloc_base$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _calloc_base$MH = RuntimeHelper.downcallHandle(
        "_calloc_base",
        constants$737._calloc_base$FUNC, false
    );
    static final FunctionDescriptor calloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle calloc$MH = RuntimeHelper.downcallHandle(
        "calloc",
        constants$737.calloc$FUNC, false
    );
    static final FunctionDescriptor _callnewh$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _callnewh$MH = RuntimeHelper.downcallHandle(
        "_callnewh",
        constants$737._callnewh$FUNC, false
    );
}


