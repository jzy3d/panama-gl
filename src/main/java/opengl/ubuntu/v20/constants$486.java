// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$486 {

    static final FunctionDescriptor PFNGLMAPVERTEXATTRIB2FAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMAPVERTEXATTRIB2FAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIFFIIFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$486.PFNGLMAPVERTEXATTRIB2FAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWBUFFERSATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDRAWBUFFERSATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$486.PFNGLDRAWBUFFERSATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLELEMENTPOINTERATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLELEMENTPOINTERATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$486.PFNGLELEMENTPOINTERATIPROC$FUNC, false
    );
}


