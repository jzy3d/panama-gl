// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$162 {

    static final FunctionDescriptor glBindAttribLocation$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glBindAttribLocation$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindAttribLocation",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$162.glBindAttribLocation$FUNC, false
    );
    static final FunctionDescriptor glGetActiveAttrib$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetActiveAttrib$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetActiveAttrib",
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$162.glGetActiveAttrib$FUNC, false
    );
    static final FunctionDescriptor glGetAttribLocation$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetAttribLocation$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetAttribLocation",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$162.glGetAttribLocation$FUNC, false
    );
    static final FunctionDescriptor glStencilFuncSeparate$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilFuncSeparate$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilFuncSeparate",
        "(IIII)V",
        constants$162.glStencilFuncSeparate$FUNC, false
    );
    static final FunctionDescriptor glStencilOpSeparate$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilOpSeparate$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilOpSeparate",
        "(IIII)V",
        constants$162.glStencilOpSeparate$FUNC, false
    );
    static final FunctionDescriptor glStencilMaskSeparate$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilMaskSeparate$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilMaskSeparate",
        "(II)V",
        constants$162.glStencilMaskSeparate$FUNC, false
    );
}


