// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$150 {

    static final FunctionDescriptor glVertexAttrib3dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib3dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$150.glVertexAttrib3dv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertexAttrib3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3f",
        "(IFFF)V",
        constants$150.glVertexAttrib3f$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$150.glVertexAttrib3fv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glVertexAttrib3s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3s",
        "(ISSS)V",
        constants$150.glVertexAttrib3s$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib3sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$150.glVertexAttrib3sv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4Nbv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4Nbv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4Nbv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$150.glVertexAttrib4Nbv$FUNC, false
    );
}


