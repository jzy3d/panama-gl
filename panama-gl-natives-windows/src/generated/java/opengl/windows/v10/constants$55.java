// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$55 {

    static final FunctionDescriptor _mm_pause$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _mm_pause$MH = RuntimeHelper.downcallHandle(
        "_mm_pause",
        constants$55._mm_pause$FUNC, false
    );
    static final FunctionDescriptor _mm_prefetch$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _mm_prefetch$MH = RuntimeHelper.downcallHandle(
        "_mm_prefetch",
        constants$55._mm_prefetch$FUNC, false
    );
    static final FunctionDescriptor _m_prefetchw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _m_prefetchw$MH = RuntimeHelper.downcallHandle(
        "_m_prefetchw",
        constants$55._m_prefetchw$FUNC, false
    );
    static final FunctionDescriptor _mm_getcsr$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _mm_getcsr$MH = RuntimeHelper.downcallHandle(
        "_mm_getcsr",
        constants$55._mm_getcsr$FUNC, false
    );
    static final FunctionDescriptor _mm_setcsr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _mm_setcsr$MH = RuntimeHelper.downcallHandle(
        "_mm_setcsr",
        constants$55._mm_setcsr$FUNC, false
    );
    static final FunctionDescriptor __getcallerseflags$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle __getcallerseflags$MH = RuntimeHelper.downcallHandle(
        "__getcallerseflags",
        constants$55.__getcallerseflags$FUNC, false
    );
}


