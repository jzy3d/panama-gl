// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$732 {

    static final FunctionDescriptor PFNGLCREATESTATESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATESTATESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$732.PFNGLCREATESTATESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETESTATESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETESTATESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$732.PFNGLDELETESTATESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISSTATENVPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISSTATENVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$732.PFNGLISSTATENVPROC$FUNC, false
    );
}

