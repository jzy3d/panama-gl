// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$678 {

    static final FunctionDescriptor PFNGLTEXCOORDPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXCOORDPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$678.PFNGLTEXCOORDPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$678.PFNGLVERTEXPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL1DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIBL1DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$678.PFNGLVERTEXATTRIBL1DEXTPROC$FUNC, false
    );
}


