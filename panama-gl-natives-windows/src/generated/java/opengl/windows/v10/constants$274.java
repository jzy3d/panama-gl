// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$274 {

    static final FunctionDescriptor CreateMailslotW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateMailslotW$MH = RuntimeHelper.downcallHandle(
        "CreateMailslotW",
        constants$274.CreateMailslotW$FUNC, false
    );
    static final FunctionDescriptor GetMailslotInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMailslotInfo$MH = RuntimeHelper.downcallHandle(
        "GetMailslotInfo",
        constants$274.GetMailslotInfo$FUNC, false
    );
    static final FunctionDescriptor SetMailslotInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMailslotInfo$MH = RuntimeHelper.downcallHandle(
        "SetMailslotInfo",
        constants$274.SetMailslotInfo$FUNC, false
    );
    static final FunctionDescriptor EncryptFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncryptFileA$MH = RuntimeHelper.downcallHandle(
        "EncryptFileA",
        constants$274.EncryptFileA$FUNC, false
    );
    static final FunctionDescriptor EncryptFileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncryptFileW$MH = RuntimeHelper.downcallHandle(
        "EncryptFileW",
        constants$274.EncryptFileW$FUNC, false
    );
    static final FunctionDescriptor DecryptFileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DecryptFileA$MH = RuntimeHelper.downcallHandle(
        "DecryptFileA",
        constants$274.DecryptFileA$FUNC, false
    );
}


