// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$369 {

    static final FunctionDescriptor PFNGLCREATERENDERBUFFERSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATERENDERBUFFERSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$369.PFNGLCREATERENDERBUFFERSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDRENDERBUFFERSTORAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDRENDERBUFFERSTORAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$369.PFNGLNAMEDRENDERBUFFERSTORAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$369.PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEPROC$FUNC, false
    );
}


