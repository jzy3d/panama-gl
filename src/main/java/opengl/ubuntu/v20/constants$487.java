// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$487 {

    static final FunctionDescriptor PFNGLDRAWELEMENTARRAYATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWELEMENTARRAYATIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$487.PFNGLDRAWELEMENTARRAYATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWRANGEELEMENTARRAYATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWRANGEELEMENTARRAYATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$487.PFNGLDRAWRANGEELEMENTARRAYATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXBUMPPARAMETERIVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXBUMPPARAMETERIVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$487.PFNGLTEXBUMPPARAMETERIVATIPROC$FUNC, false
    );
}


