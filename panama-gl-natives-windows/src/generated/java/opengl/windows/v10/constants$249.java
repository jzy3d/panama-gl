// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$249 {

    static final FunctionDescriptor DeleteBoundaryDescriptor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteBoundaryDescriptor$MH = RuntimeHelper.downcallHandle(
        "DeleteBoundaryDescriptor",
        constants$249.DeleteBoundaryDescriptor$FUNC, false
    );
    static final FunctionDescriptor GetNumaHighestNodeNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaHighestNodeNumber$MH = RuntimeHelper.downcallHandle(
        "GetNumaHighestNodeNumber",
        constants$249.GetNumaHighestNodeNumber$FUNC, false
    );
    static final FunctionDescriptor GetNumaNodeProcessorMaskEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaNodeProcessorMaskEx$MH = RuntimeHelper.downcallHandle(
        "GetNumaNodeProcessorMaskEx",
        constants$249.GetNumaNodeProcessorMaskEx$FUNC, false
    );
    static final FunctionDescriptor GetNumaProximityNodeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetNumaProximityNodeEx$MH = RuntimeHelper.downcallHandle(
        "GetNumaProximityNodeEx",
        constants$249.GetNumaProximityNodeEx$FUNC, false
    );
    static final FunctionDescriptor GetProcessGroupAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessGroupAffinity$MH = RuntimeHelper.downcallHandle(
        "GetProcessGroupAffinity",
        constants$249.GetProcessGroupAffinity$FUNC, false
    );
    static final FunctionDescriptor GetThreadGroupAffinity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadGroupAffinity$MH = RuntimeHelper.downcallHandle(
        "GetThreadGroupAffinity",
        constants$249.GetThreadGroupAffinity$FUNC, false
    );
}


