// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$403 {

    static final FunctionDescriptor PFNGLGETVERTEXATTRIBLUI64VARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBLUI64VARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$403.PFNGLGETVERTEXATTRIBLUI64VARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATESYNCFROMCLEVENTARBPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLCREATESYNCFROMCLEVENTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$403.PFNGLCREATESYNCFROMCLEVENTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCLAMPCOLORARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCLAMPCOLORARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$403.PFNGLCLAMPCOLORARBPROC$FUNC, false
    );
}


