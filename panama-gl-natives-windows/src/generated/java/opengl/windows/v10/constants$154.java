// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$154 {

    static final FunctionDescriptor PTOP_LEVEL_EXCEPTION_FILTER$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTOP_LEVEL_EXCEPTION_FILTER$MH = RuntimeHelper.downcallHandle(
        constants$154.PTOP_LEVEL_EXCEPTION_FILTER$FUNC, false
    );
    static final FunctionDescriptor LPTOP_LEVEL_EXCEPTION_FILTER$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPTOP_LEVEL_EXCEPTION_FILTER$MH = RuntimeHelper.downcallHandle(
        constants$154.LPTOP_LEVEL_EXCEPTION_FILTER$FUNC, false
    );
    static final FunctionDescriptor RaiseException$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RaiseException$MH = RuntimeHelper.downcallHandle(
        "RaiseException",
        constants$154.RaiseException$FUNC, false
    );
    static final FunctionDescriptor UnhandledExceptionFilter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnhandledExceptionFilter$MH = RuntimeHelper.downcallHandle(
        "UnhandledExceptionFilter",
        constants$154.UnhandledExceptionFilter$FUNC, false
    );
}


