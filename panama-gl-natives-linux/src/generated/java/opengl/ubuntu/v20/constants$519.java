// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$519 {

    static final FunctionDescriptor PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOPYCOLORSUBTABLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIII)V",
        constants$519.PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLLOCKARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$519.PFNGLLOCKARRAYSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLUNLOCKARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$519.PFNGLUNLOCKARRAYSEXTPROC$FUNC, false
    );
}


