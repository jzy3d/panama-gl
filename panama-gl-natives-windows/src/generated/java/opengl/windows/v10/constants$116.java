// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$116 {

    static final FunctionDescriptor RtlCrc64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlCrc64$MH = RuntimeHelper.downcallHandle(
        "RtlCrc64",
        constants$116.RtlCrc64$FUNC, false
    );
    static final FunctionDescriptor RtlOsDeploymentState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlOsDeploymentState$MH = RuntimeHelper.downcallHandle(
        "RtlOsDeploymentState",
        constants$116.RtlOsDeploymentState$FUNC, false
    );
    static final FunctionDescriptor RtlGetNonVolatileToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlGetNonVolatileToken$MH = RuntimeHelper.downcallHandle(
        "RtlGetNonVolatileToken",
        constants$116.RtlGetNonVolatileToken$FUNC, false
    );
    static final FunctionDescriptor RtlFreeNonVolatileToken$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlFreeNonVolatileToken$MH = RuntimeHelper.downcallHandle(
        "RtlFreeNonVolatileToken",
        constants$116.RtlFreeNonVolatileToken$FUNC, false
    );
    static final FunctionDescriptor RtlFlushNonVolatileMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlFlushNonVolatileMemory$MH = RuntimeHelper.downcallHandle(
        "RtlFlushNonVolatileMemory",
        constants$116.RtlFlushNonVolatileMemory$FUNC, false
    );
    static final FunctionDescriptor RtlDrainNonVolatileFlush$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlDrainNonVolatileFlush$MH = RuntimeHelper.downcallHandle(
        "RtlDrainNonVolatileFlush",
        constants$116.RtlDrainNonVolatileFlush$FUNC, false
    );
}


