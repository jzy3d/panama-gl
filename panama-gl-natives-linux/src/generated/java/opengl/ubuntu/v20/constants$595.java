// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$595 {

    static final FunctionDescriptor PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$595.PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$595.PFNGLNAMEDRENDERBUFFERSTORAGEMULTISAMPLECOVERAGEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)I",
        constants$595.PFNGLCHECKNAMEDFRAMEBUFFERSTATUSEXTPROC$FUNC, false
    );
}


