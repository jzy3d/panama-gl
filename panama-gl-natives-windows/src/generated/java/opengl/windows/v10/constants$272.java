// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$272 {

    static final FunctionDescriptor WriteTapemark$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteTapemark$MH = RuntimeHelper.downcallHandle(
        "WriteTapemark",
        constants$272.WriteTapemark$FUNC, false
    );
    static final FunctionDescriptor GetTapeStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTapeStatus$MH = RuntimeHelper.downcallHandle(
        "GetTapeStatus",
        constants$272.GetTapeStatus$FUNC, false
    );
    static final FunctionDescriptor GetTapeParameters$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTapeParameters$MH = RuntimeHelper.downcallHandle(
        "GetTapeParameters",
        constants$272.GetTapeParameters$FUNC, false
    );
    static final FunctionDescriptor SetTapeParameters$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetTapeParameters$MH = RuntimeHelper.downcallHandle(
        "SetTapeParameters",
        constants$272.SetTapeParameters$FUNC, false
    );
    static final FunctionDescriptor MulDiv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MulDiv$MH = RuntimeHelper.downcallHandle(
        "MulDiv",
        constants$272.MulDiv$FUNC, false
    );
    static final FunctionDescriptor GetSystemDEPPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetSystemDEPPolicy$MH = RuntimeHelper.downcallHandle(
        "GetSystemDEPPolicy",
        constants$272.GetSystemDEPPolicy$FUNC, false
    );
}


