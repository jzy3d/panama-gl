// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$674 {

    static final FunctionDescriptor glRectiv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glRectiv$MH = RuntimeHelper.downcallHandle(
        "glRectiv",
        constants$674.glRectiv$FUNC, false
    );
    static final FunctionDescriptor glRects$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle glRects$MH = RuntimeHelper.downcallHandle(
        "glRects",
        constants$674.glRects$FUNC, false
    );
    static final FunctionDescriptor glRectsv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glRectsv$MH = RuntimeHelper.downcallHandle(
        "glRectsv",
        constants$674.glRectsv$FUNC, false
    );
    static final FunctionDescriptor glRenderMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glRenderMode$MH = RuntimeHelper.downcallHandle(
        "glRenderMode",
        constants$674.glRenderMode$FUNC, false
    );
    static final FunctionDescriptor glRotated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glRotated$MH = RuntimeHelper.downcallHandle(
        "glRotated",
        constants$674.glRotated$FUNC, false
    );
    static final FunctionDescriptor glRotatef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle glRotatef$MH = RuntimeHelper.downcallHandle(
        "glRotatef",
        constants$674.glRotatef$FUNC, false
    );
}


