// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$954 {

    static final FunctionDescriptor glutPassiveMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutPassiveMotionFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutPassiveMotionFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$954.glutPassiveMotionFunc$FUNC, false
    );
    static final FunctionDescriptor glutEntryFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutEntryFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$954.glutEntryFunc$callback$FUNC, false
    );
    static final FunctionDescriptor glutEntryFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutEntryFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutEntryFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$954.glutEntryFunc$FUNC, false
    );
    static final FunctionDescriptor glutKeyboardUpFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_INT,
        C_INT
    );
    static final MethodHandle glutKeyboardUpFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(BII)V",
        constants$954.glutKeyboardUpFunc$callback$FUNC, false
    );
}

