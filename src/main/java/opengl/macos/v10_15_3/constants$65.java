// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$65 {

    static final FunctionDescriptor glMapVertexAttrib1fAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMapVertexAttrib1fAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapVertexAttrib1fAPPLE",
        "(IIFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$65.glMapVertexAttrib1fAPPLE$FUNC, false
    );
    static final FunctionDescriptor glMapVertexAttrib2dAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMapVertexAttrib2dAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapVertexAttrib2dAPPLE",
        "(IIDDIIDDIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$65.glMapVertexAttrib2dAPPLE$FUNC, false
    );
    static final FunctionDescriptor glMapVertexAttrib2fAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMapVertexAttrib2fAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapVertexAttrib2fAPPLE",
        "(IIFFIIFFIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$65.glMapVertexAttrib2fAPPLE$FUNC, false
    );
    static final FunctionDescriptor glBlendEquationSeparateATI$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBlendEquationSeparateATI$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendEquationSeparateATI",
        "(II)V",
        constants$65.glBlendEquationSeparateATI$FUNC, false
    );
    static final FunctionDescriptor glStencilOpSeparateATI$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilOpSeparateATI$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilOpSeparateATI",
        "(IIII)V",
        constants$65.glStencilOpSeparateATI$FUNC, false
    );
    static final FunctionDescriptor glStencilFuncSeparateATI$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glStencilFuncSeparateATI$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glStencilFuncSeparateATI",
        "(IIII)V",
        constants$65.glStencilFuncSeparateATI$FUNC, false
    );
}


