// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$693 {

    static final FunctionDescriptor PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$693.PFNGLGETVERTEXARRAYPOINTERI_VEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAPNAMEDBUFFERRANGEEXTPROC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_LONG,
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLMAPNAMEDBUFFERRANGEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJI)Ljdk/incubator/foreign/MemoryAddress;",
        constants$693.PFNGLMAPNAMEDBUFFERRANGEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJ)V",
        constants$693.PFNGLFLUSHMAPPEDNAMEDBUFFERRANGEEXTPROC$FUNC, false
    );
}


