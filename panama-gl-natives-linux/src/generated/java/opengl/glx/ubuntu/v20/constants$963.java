// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$963 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBIPOINTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBIPOINTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$963.PFNGLVERTEXATTRIBIPOINTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$963.PFNGLGETVERTEXATTRIBIIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIUIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIUIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$963.PFNGLGETVERTEXATTRIBIUIVEXTPROC$FUNC, false
    );
}


