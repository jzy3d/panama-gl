// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$115 {

    static final FunctionDescriptor glSeparableFilter2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glSeparableFilter2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSeparableFilter2D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$115.glSeparableFilter2D$FUNC, false
    );
    static final FunctionDescriptor glShadeModel$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glShadeModel$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glShadeModel",
        "(I)V",
        constants$115.glShadeModel$FUNC, false
    );
    static final FunctionDescriptor glStencilFunc$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilFunc",
        "(III)V",
        constants$115.glStencilFunc$FUNC, false
    );
    static final FunctionDescriptor glStencilMask$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glStencilMask$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilMask",
        "(I)V",
        constants$115.glStencilMask$FUNC, false
    );
    static final FunctionDescriptor glStencilOp$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilOp$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilOp",
        "(III)V",
        constants$115.glStencilOp$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glTexCoord1d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord1d",
        "(D)V",
        constants$115.glTexCoord1d$FUNC, false
    );
}


