// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$68 {

    static final FunctionDescriptor glBlendColor$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glBlendColor$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendColor",
        "(FFFF)V",
        constants$68.glBlendColor$FUNC, false
    );
    static final FunctionDescriptor glBlendEquation$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glBlendEquation$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendEquation",
        "(I)V",
        constants$68.glBlendEquation$FUNC, false
    );
    static final FunctionDescriptor glBlendEquationSeparate$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBlendEquationSeparate$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendEquationSeparate",
        "(II)V",
        constants$68.glBlendEquationSeparate$FUNC, false
    );
    static final FunctionDescriptor glBlendFunc$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBlendFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendFunc",
        "(II)V",
        constants$68.glBlendFunc$FUNC, false
    );
    static final FunctionDescriptor glCallList$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glCallList$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCallList",
        "(I)V",
        constants$68.glCallList$FUNC, false
    );
    static final FunctionDescriptor glCallLists$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCallLists$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCallLists",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$68.glCallLists$FUNC, false
    );
}


