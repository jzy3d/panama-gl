// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$322 {

    static final FunctionDescriptor SetThreadpoolCallbackPriority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolCallbackPriority$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolCallbackPriority",
        constants$322.SetThreadpoolCallbackPriority$FUNC, false
    );
    static final FunctionDescriptor DestroyThreadpoolEnvironment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyThreadpoolEnvironment$MH = RuntimeHelper.downcallHandle(
        "DestroyThreadpoolEnvironment",
        constants$322.DestroyThreadpoolEnvironment$FUNC, false
    );
    static final FunctionDescriptor SetThreadpoolCallbackPersistent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolCallbackPersistent$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolCallbackPersistent",
        constants$322.SetThreadpoolCallbackPersistent$FUNC, false
    );
    static final FunctionDescriptor CreatePrivateNamespaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateNamespaceA$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateNamespaceA",
        constants$322.CreatePrivateNamespaceA$FUNC, false
    );
    static final FunctionDescriptor OpenPrivateNamespaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrivateNamespaceA$MH = RuntimeHelper.downcallHandle(
        "OpenPrivateNamespaceA",
        constants$322.OpenPrivateNamespaceA$FUNC, false
    );
    static final FunctionDescriptor CreateBoundaryDescriptorA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateBoundaryDescriptorA$MH = RuntimeHelper.downcallHandle(
        "CreateBoundaryDescriptorA",
        constants$322.CreateBoundaryDescriptorA$FUNC, false
    );
}


