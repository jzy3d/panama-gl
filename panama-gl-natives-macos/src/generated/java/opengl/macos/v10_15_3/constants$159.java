// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$159 {

    static final FunctionDescriptor glUniform2iv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glUniform2iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform2iv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.glUniform2iv$FUNC, false
    );
    static final FunctionDescriptor glUniform3iv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glUniform3iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform3iv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.glUniform3iv$FUNC, false
    );
    static final FunctionDescriptor glUniform4iv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glUniform4iv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform4iv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.glUniform4iv$FUNC, false
    );
    static final FunctionDescriptor glUniformMatrix2fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle glUniformMatrix2fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformMatrix2fv",
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.glUniformMatrix2fv$FUNC, false
    );
    static final FunctionDescriptor glUniformMatrix3fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle glUniformMatrix3fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformMatrix3fv",
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.glUniformMatrix3fv$FUNC, false
    );
    static final FunctionDescriptor glUniformMatrix4fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle glUniformMatrix4fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformMatrix4fv",
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$159.glUniformMatrix4fv$FUNC, false
    );
}


