// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$175 {

    static final FunctionDescriptor PFNGLTEXBUFFERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXBUFFERPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$175.PFNGLTEXBUFFERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPRIMITIVERESTARTINDEXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLPRIMITIVERESTARTINDEXPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$175.PFNGLPRIMITIVERESTARTINDEXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLCOPYBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJJ)V",
        constants$175.PFNGLCOPYBUFFERSUBDATAPROC$FUNC, false
    );
}


