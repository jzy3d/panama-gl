// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$702 {

    static final FunctionDescriptor gluBeginCurve$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluBeginCurve$MH = RuntimeHelper.downcallHandle(
        "gluBeginCurve",
        constants$702.gluBeginCurve$FUNC, false
    );
    static final FunctionDescriptor gluEndCurve$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluEndCurve$MH = RuntimeHelper.downcallHandle(
        "gluEndCurve",
        constants$702.gluEndCurve$FUNC, false
    );
    static final FunctionDescriptor gluEndSurface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluEndSurface$MH = RuntimeHelper.downcallHandle(
        "gluEndSurface",
        constants$702.gluEndSurface$FUNC, false
    );
    static final FunctionDescriptor gluBeginTrim$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluBeginTrim$MH = RuntimeHelper.downcallHandle(
        "gluBeginTrim",
        constants$702.gluBeginTrim$FUNC, false
    );
    static final FunctionDescriptor gluEndTrim$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gluEndTrim$MH = RuntimeHelper.downcallHandle(
        "gluEndTrim",
        constants$702.gluEndTrim$FUNC, false
    );
    static final FunctionDescriptor gluPwlCurve$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle gluPwlCurve$MH = RuntimeHelper.downcallHandle(
        "gluPwlCurve",
        constants$702.gluPwlCurve$FUNC, false
    );
}


