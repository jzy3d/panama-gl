// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$753 {

    static final FunctionDescriptor _onexit_t$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _onexit_t$MH = RuntimeHelper.downcallHandle(
        constants$753._onexit_t$FUNC, false
    );
    static final FunctionDescriptor atexit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0$MH = RuntimeHelper.downcallHandle(
        constants$753.atexit$x0$FUNC, false
    );
    static final FunctionDescriptor atexit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atexit$MH = RuntimeHelper.downcallHandle(
        "atexit",
        constants$753.atexit$FUNC, false
    );
    static final FunctionDescriptor _onexit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _onexit$MH = RuntimeHelper.downcallHandle(
        "_onexit",
        constants$753._onexit$FUNC, false
    );
}


