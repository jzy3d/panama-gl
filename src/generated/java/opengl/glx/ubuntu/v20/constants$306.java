// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$306 {

    static final FunctionDescriptor PFNGLCLEARDEPTHFPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle PFNGLCLEARDEPTHFPROC$MH = RuntimeHelper.downcallHandle(
        "(F)V",
        constants$306.PFNGLCLEARDEPTHFPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMBINARYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMBINARYPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$306.PFNGLGETPROGRAMBINARYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPROGRAMBINARYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLPROGRAMBINARYPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$306.PFNGLPROGRAMBINARYPROC$FUNC, false
    );
}


