// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$545 {

    static final FunctionDescriptor PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIII)V",
        constants$545.PFNGLCOPYTEXTURESUBIMAGE1DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIII)V",
        constants$545.PFNGLCOPYTEXTURESUBIMAGE2DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTEXTUREIMAGEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXTUREIMAGEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$545.PFNGLGETTEXTUREIMAGEEXTPROC$FUNC, false
    );
}


