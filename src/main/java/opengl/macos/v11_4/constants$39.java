// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$39 {

    static final FunctionDescriptor glWindowPos3sARB$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glWindowPos3sARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3sARB",
        "(SSS)V",
        constants$39.glWindowPos3sARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos3svARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos3svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos3svARB",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$39.glWindowPos3svARB$FUNC, false
    );
    static final FunctionDescriptor glUniformBufferEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glUniformBufferEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glUniformBufferEXT",
        "(III)V",
        constants$39.glUniformBufferEXT$FUNC, false
    );
    static final FunctionDescriptor glGetUniformBufferSizeEXT$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glGetUniformBufferSizeEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetUniformBufferSizeEXT",
        "(II)I",
        constants$39.glGetUniformBufferSizeEXT$FUNC, false
    );
    static final FunctionDescriptor glGetUniformOffsetEXT$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_INT
    );
    static final MethodHandle glGetUniformOffsetEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetUniformOffsetEXT",
        "(II)J",
        constants$39.glGetUniformOffsetEXT$FUNC, false
    );
    static final FunctionDescriptor glBlendColorEXT$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glBlendColorEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendColorEXT",
        "(FFFF)V",
        constants$39.glBlendColorEXT$FUNC, false
    );
}


