// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$157 {

    static final FunctionDescriptor glUniform2f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glUniform2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform2f",
        "(IFF)V",
        constants$157.glUniform2f$FUNC, false
    );
    static final FunctionDescriptor glUniform3f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glUniform3f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform3f",
        "(IFFF)V",
        constants$157.glUniform3f$FUNC, false
    );
    static final FunctionDescriptor glUniform4f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glUniform4f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform4f",
        "(IFFFF)V",
        constants$157.glUniform4f$FUNC, false
    );
    static final FunctionDescriptor glUniform1i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glUniform1i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform1i",
        "(II)V",
        constants$157.glUniform1i$FUNC, false
    );
    static final FunctionDescriptor glUniform2i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glUniform2i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform2i",
        "(III)V",
        constants$157.glUniform2i$FUNC, false
    );
    static final FunctionDescriptor glUniform3i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glUniform3i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniform3i",
        "(IIII)V",
        constants$157.glUniform3i$FUNC, false
    );
}


