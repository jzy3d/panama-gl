// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$344 {

    static final FunctionDescriptor PFNGLGETPROGRAMRESOURCEINDEXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMRESOURCEINDEXPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$344.PFNGLGETPROGRAMRESOURCEINDEXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMRESOURCENAMEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMRESOURCENAMEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$344.PFNGLGETPROGRAMRESOURCENAMEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETPROGRAMRESOURCEIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETPROGRAMRESOURCEIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$344.PFNGLGETPROGRAMRESOURCEIVPROC$FUNC, false
    );
}


