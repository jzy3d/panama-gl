// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$229 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4USVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4USVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$229.PFNGLVERTEXATTRIB4USVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBPOINTERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBPOINTERPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIBILjdk/incubator/foreign/MemoryAddress;)V",
        constants$229.PFNGLVERTEXATTRIBPOINTERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORMMATRIX2X3FVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle PFNGLUNIFORMMATRIX2X3FVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$229.PFNGLUNIFORMMATRIX2X3FVPROC$FUNC, false
    );
}


