// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$478 {

    static final FunctionDescriptor PFNGLTESTFENCEAPPLEPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLTESTFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$478.PFNGLTESTFENCEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFINISHFENCEAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLFINISHFENCEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$478.PFNGLFINISHFENCEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTESTOBJECTAPPLEPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTESTOBJECTAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(II)B",
        constants$478.PFNGLTESTOBJECTAPPLEPROC$FUNC, false
    );
}


