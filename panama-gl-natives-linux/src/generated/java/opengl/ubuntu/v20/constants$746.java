// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$746 {

    static final FunctionDescriptor PFNGLGETMULTISAMPLEFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMULTISAMPLEFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$746.PFNGLGETMULTISAMPLEFVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLEMASKINDEXEDNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSAMPLEMASKINDEXEDNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$746.PFNGLSAMPLEMASKINDEXEDNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXRENDERBUFFERNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXRENDERBUFFERNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$746.PFNGLTEXRENDERBUFFERNVPROC$FUNC, false
    );
}


