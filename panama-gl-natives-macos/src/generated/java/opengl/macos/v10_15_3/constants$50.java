// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$50 {

    static final FunctionDescriptor glVertexAttribI4ubvEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttribI4ubvEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttribI4ubvEXT",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glVertexAttribI4ubvEXT$FUNC, false
    );
    static final FunctionDescriptor glVertexAttribI4usvEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttribI4usvEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttribI4usvEXT",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glVertexAttribI4usvEXT$FUNC, false
    );
    static final FunctionDescriptor glVertexAttribIPointerEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttribIPointerEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttribIPointerEXT",
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glVertexAttribIPointerEXT$FUNC, false
    );
    static final FunctionDescriptor glGetVertexAttribIivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetVertexAttribIivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetVertexAttribIivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glGetVertexAttribIivEXT$FUNC, false
    );
    static final FunctionDescriptor glGetVertexAttribIuivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetVertexAttribIuivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetVertexAttribIuivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$50.glGetVertexAttribIuivEXT$FUNC, false
    );
    static final FunctionDescriptor glUniform1uiEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glUniform1uiEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform1uiEXT",
        "(II)V",
        constants$50.glUniform1uiEXT$FUNC, false
    );
}


