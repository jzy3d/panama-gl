// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor __va_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __va_start$MH = RuntimeHelper.downcallHandle(
        "__va_start",
        constants$0.__va_start$FUNC, true
    );
    static final FunctionDescriptor __security_init_cookie$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __security_init_cookie$MH = RuntimeHelper.downcallHandle(
        "__security_init_cookie",
        constants$0.__security_init_cookie$FUNC, false
    );
    static final FunctionDescriptor __security_check_cookie$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __security_check_cookie$MH = RuntimeHelper.downcallHandle(
        "__security_check_cookie",
        constants$0.__security_check_cookie$FUNC, false
    );
    static final FunctionDescriptor __report_gsfailure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __report_gsfailure$MH = RuntimeHelper.downcallHandle(
        "__report_gsfailure",
        constants$0.__report_gsfailure$FUNC, false
    );
    static final  OfLong __security_cookie$LAYOUT = Constants$root.C_LONG_LONG$LAYOUT;
    static final VarHandle __security_cookie$VH = constants$0.__security_cookie$LAYOUT.varHandle();
    static final MemorySegment __security_cookie$SEGMENT = RuntimeHelper.lookupGlobalVariable("__security_cookie", constants$0.__security_cookie$LAYOUT);
    static final FunctionDescriptor __C_specific_handler$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __C_specific_handler$MH = RuntimeHelper.downcallHandle(
        "__C_specific_handler",
        constants$0.__C_specific_handler$FUNC, false
    );
}


