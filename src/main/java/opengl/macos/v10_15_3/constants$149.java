// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$149 {

    static final FunctionDescriptor glVertexAttrib2dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib2dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glVertexAttrib2dv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertexAttrib2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2f",
        "(IFF)V",
        constants$149.glVertexAttrib2f$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib2fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glVertexAttrib2fv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glVertexAttrib2s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2s",
        "(ISS)V",
        constants$149.glVertexAttrib2s$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib2sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glVertexAttrib2sv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertexAttrib3d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3d",
        "(IDDD)V",
        constants$149.glVertexAttrib3d$FUNC, false
    );
}


