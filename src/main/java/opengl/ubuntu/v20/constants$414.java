// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$414 {

    static final FunctionDescriptor PFNGLCLEARCOLORXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCLEARCOLORXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$414.PFNGLCLEARCOLORXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLEARDEPTHXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLCLEARDEPTHXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$414.PFNGLCLEARDEPTHXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLIPPLANEXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCLIPPLANEXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$414.PFNGLCLIPPLANEXOESPROC$FUNC, false
    );
}


