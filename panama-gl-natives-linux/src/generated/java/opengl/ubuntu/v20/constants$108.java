// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$108 {

    static final FunctionDescriptor PFNGLBEGINQUERYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBEGINQUERYPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$108.PFNGLBEGINQUERYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLENDQUERYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENDQUERYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$108.PFNGLENDQUERYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETQUERYIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETQUERYIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$108.PFNGLGETQUERYIVPROC$FUNC, false
    );
}


