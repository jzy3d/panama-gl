// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor EXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EXCEPTION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$45.EXCEPTION_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor PEXCEPTION_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PEXCEPTION_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$45.PEXCEPTION_ROUTINE$FUNC, false
    );
    static final FunctionDescriptor _bittest$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _bittest$MH = RuntimeHelper.downcallHandle(
        "_bittest",
        constants$45._bittest$FUNC, false
    );
    static final FunctionDescriptor _bittestandcomplement$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _bittestandcomplement$MH = RuntimeHelper.downcallHandle(
        "_bittestandcomplement",
        constants$45._bittestandcomplement$FUNC, false
    );
}


