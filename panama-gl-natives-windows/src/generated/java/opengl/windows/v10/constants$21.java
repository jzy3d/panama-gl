// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$21 {

    static final FunctionDescriptor _set_errno$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _set_errno$MH = RuntimeHelper.downcallHandle(
        "_set_errno",
        constants$21._set_errno$FUNC, false
    );
    static final FunctionDescriptor _get_errno$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _get_errno$MH = RuntimeHelper.downcallHandle(
        "_get_errno",
        constants$21._get_errno$FUNC, false
    );
    static final FunctionDescriptor __doserrno$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle __doserrno$MH = RuntimeHelper.downcallHandle(
        "__doserrno",
        constants$21.__doserrno$FUNC, false
    );
    static final FunctionDescriptor _set_doserrno$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _set_doserrno$MH = RuntimeHelper.downcallHandle(
        "_set_doserrno",
        constants$21._set_doserrno$FUNC, false
    );
    static final FunctionDescriptor _get_doserrno$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _get_doserrno$MH = RuntimeHelper.downcallHandle(
        "_get_doserrno",
        constants$21._get_doserrno$FUNC, false
    );
    static final FunctionDescriptor memchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle memchr$MH = RuntimeHelper.downcallHandle(
        "memchr",
        constants$21.memchr$FUNC, false
    );
}


