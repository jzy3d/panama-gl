// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$448 {

    static final FunctionDescriptor PFNGLQUERYMATRIXXOESPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLQUERYMATRIXXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$448.PFNGLQUERYMATRIXXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARDEPTHFOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle PFNGLCLEARDEPTHFOESPROC$MH = RuntimeHelper.downcallHandle(
        "(F)V",
        constants$448.PFNGLCLEARDEPTHFOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLIPPLANEFOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLIPPLANEFOESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$448.PFNGLCLIPPLANEFOESPROC$FUNC, false
    );
}


