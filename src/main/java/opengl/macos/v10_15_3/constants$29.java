// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$29 {

    static final FunctionDescriptor glBindAttribLocationARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glBindAttribLocationARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindAttribLocationARB",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$29.glBindAttribLocationARB$FUNC, false
    );
    static final FunctionDescriptor glGetActiveAttribARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetActiveAttribARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetActiveAttribARB",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$29.glGetActiveAttribARB$FUNC, false
    );
    static final FunctionDescriptor glGetAttribLocationARB$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetAttribLocationARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetAttribLocationARB",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$29.glGetAttribLocationARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle glVertexAttrib1dARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1dARB",
        "(ID)V",
        constants$29.glVertexAttrib1dARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib1dvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1dvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$29.glVertexAttrib1dvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1fARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glVertexAttrib1fARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1fARB",
        "(IF)V",
        constants$29.glVertexAttrib1fARB$FUNC, false
    );
}


