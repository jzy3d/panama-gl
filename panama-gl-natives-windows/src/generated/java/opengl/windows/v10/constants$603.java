// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$603 {

    static final FunctionDescriptor WNetGetNetworkInformationA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetNetworkInformationA$MH = RuntimeHelper.downcallHandle(
        "WNetGetNetworkInformationA",
        constants$603.WNetGetNetworkInformationA$FUNC, false
    );
    static final FunctionDescriptor WNetGetNetworkInformationW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WNetGetNetworkInformationW$MH = RuntimeHelper.downcallHandle(
        "WNetGetNetworkInformationW",
        constants$603.WNetGetNetworkInformationW$FUNC, false
    );
    static final FunctionDescriptor WNetGetLastErrorA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetGetLastErrorA$MH = RuntimeHelper.downcallHandle(
        "WNetGetLastErrorA",
        constants$603.WNetGetLastErrorA$FUNC, false
    );
    static final FunctionDescriptor WNetGetLastErrorW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WNetGetLastErrorW$MH = RuntimeHelper.downcallHandle(
        "WNetGetLastErrorW",
        constants$603.WNetGetLastErrorW$FUNC, false
    );
    static final FunctionDescriptor MultinetGetConnectionPerformanceA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MultinetGetConnectionPerformanceA$MH = RuntimeHelper.downcallHandle(
        "MultinetGetConnectionPerformanceA",
        constants$603.MultinetGetConnectionPerformanceA$FUNC, false
    );
    static final FunctionDescriptor MultinetGetConnectionPerformanceW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MultinetGetConnectionPerformanceW$MH = RuntimeHelper.downcallHandle(
        "MultinetGetConnectionPerformanceW",
        constants$603.MultinetGetConnectionPerformanceW$FUNC, false
    );
}


