// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$776 {

    static final FunctionDescriptor swab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle swab$MH = RuntimeHelper.downcallHandle(
        "swab",
        constants$776.swab$FUNC, false
    );
    static final FunctionDescriptor ultoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ultoa$MH = RuntimeHelper.downcallHandle(
        "ultoa",
        constants$776.ultoa$FUNC, false
    );
    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        "putenv",
        constants$776.putenv$FUNC, false
    );
    static final FunctionDescriptor onexit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle onexit$MH = RuntimeHelper.downcallHandle(
        "onexit",
        constants$776.onexit$FUNC, false
    );
    static final FunctionDescriptor __glutInitWithExit$exitfunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __glutInitWithExit$exitfunc$MH = RuntimeHelper.downcallHandle(
        constants$776.__glutInitWithExit$exitfunc$FUNC, false
    );
}


