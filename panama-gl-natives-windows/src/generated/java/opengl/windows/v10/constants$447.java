// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$447 {

    static final FunctionDescriptor GetOpenClipboardWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetOpenClipboardWindow$MH = RuntimeHelper.downcallHandle(
        "GetOpenClipboardWindow",
        constants$447.GetOpenClipboardWindow$FUNC, false
    );
    static final FunctionDescriptor AddClipboardFormatListener$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddClipboardFormatListener$MH = RuntimeHelper.downcallHandle(
        "AddClipboardFormatListener",
        constants$447.AddClipboardFormatListener$FUNC, false
    );
    static final FunctionDescriptor RemoveClipboardFormatListener$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveClipboardFormatListener$MH = RuntimeHelper.downcallHandle(
        "RemoveClipboardFormatListener",
        constants$447.RemoveClipboardFormatListener$FUNC, false
    );
    static final FunctionDescriptor GetUpdatedClipboardFormats$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUpdatedClipboardFormats$MH = RuntimeHelper.downcallHandle(
        "GetUpdatedClipboardFormats",
        constants$447.GetUpdatedClipboardFormats$FUNC, false
    );
    static final FunctionDescriptor CharToOemA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharToOemA$MH = RuntimeHelper.downcallHandle(
        "CharToOemA",
        constants$447.CharToOemA$FUNC, false
    );
    static final FunctionDescriptor CharToOemW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CharToOemW$MH = RuntimeHelper.downcallHandle(
        "CharToOemW",
        constants$447.CharToOemW$FUNC, false
    );
}


