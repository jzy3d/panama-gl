// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$184 {

    static final FunctionDescriptor PFNGLGETMULTISAMPLEFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETMULTISAMPLEFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$184.PFNGLGETMULTISAMPLEFVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSAMPLEMASKIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLSAMPLEMASKIPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$184.PFNGLSAMPLEMASKIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$184.PFNGLBINDFRAGDATALOCATIONINDEXEDPROC$FUNC, false
    );
}


