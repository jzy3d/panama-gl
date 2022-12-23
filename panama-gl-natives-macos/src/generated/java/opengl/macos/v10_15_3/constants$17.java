// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$17 {

    static final FunctionDescriptor glUniformMatrix2fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle glUniformMatrix2fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformMatrix2fvARB",
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$17.glUniformMatrix2fvARB$FUNC, false
    );
    static final FunctionDescriptor glUniformMatrix3fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle glUniformMatrix3fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformMatrix3fvARB",
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$17.glUniformMatrix3fvARB$FUNC, false
    );
    static final FunctionDescriptor glUniformMatrix4fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle glUniformMatrix4fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformMatrix4fvARB",
        "(IIBLjdk/incubator/foreign/MemoryAddress;)V",
        constants$17.glUniformMatrix4fvARB$FUNC, false
    );
    static final FunctionDescriptor glGetObjectParameterfvARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetObjectParameterfvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetObjectParameterfvARB",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$17.glGetObjectParameterfvARB$FUNC, false
    );
    static final FunctionDescriptor glGetObjectParameterivARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetObjectParameterivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetObjectParameterivARB",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$17.glGetObjectParameterivARB$FUNC, false
    );
    static final FunctionDescriptor glGetInfoLogARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetInfoLogARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetInfoLogARB",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$17.glGetInfoLogARB$FUNC, false
    );
}


