// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$625 {

    static final FunctionDescriptor PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$625.PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISRENDERBUFFEREXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISRENDERBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$625.PFNGLISRENDERBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDRENDERBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLBINDRENDERBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$625.PFNGLBINDRENDERBUFFEREXTPROC$FUNC, false
    );
}


