// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$153 {

    static final FunctionDescriptor glVertexAttrib4s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glVertexAttrib4s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4s",
        "(ISSSS)V",
        constants$153.glVertexAttrib4s$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glVertexAttrib4sv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4ubv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4ubv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4ubv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glVertexAttrib4ubv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4uiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4uiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4uiv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glVertexAttrib4uiv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4usv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4usv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4usv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glVertexAttrib4usv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttribPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttribPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttribPointer",
        "(IIIBILjdk/incubator/foreign/MemoryAddress;)V",
        constants$153.glVertexAttribPointer$FUNC, false
    );
}


