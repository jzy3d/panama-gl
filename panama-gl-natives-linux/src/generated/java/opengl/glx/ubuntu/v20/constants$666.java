// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$666 {

    static final FunctionDescriptor PFNGLTEXTUREBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXTUREBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$666.PFNGLTEXTUREBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTITEXBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$666.PFNGLMULTITEXBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREPARAMETERIIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXTUREPARAMETERIIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$666.PFNGLTEXTUREPARAMETERIIVEXTPROC$FUNC, false
    );
}


