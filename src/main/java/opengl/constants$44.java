// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$44 {

    static final FunctionDescriptor glGenRenderbuffersEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenRenderbuffersEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenRenderbuffersEXT",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$44.glGenRenderbuffersEXT$FUNC, false
    );
    static final FunctionDescriptor glRenderbufferStorageEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRenderbufferStorageEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRenderbufferStorageEXT",
        "(IIII)V",
        constants$44.glRenderbufferStorageEXT$FUNC, false
    );
    static final FunctionDescriptor glGetRenderbufferParameterivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetRenderbufferParameterivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetRenderbufferParameterivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$44.glGetRenderbufferParameterivEXT$FUNC, false
    );
    static final FunctionDescriptor glIsFramebufferEXT$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsFramebufferEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsFramebufferEXT",
        "(I)B",
        constants$44.glIsFramebufferEXT$FUNC, false
    );
    static final FunctionDescriptor glBindFramebufferEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBindFramebufferEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindFramebufferEXT",
        "(II)V",
        constants$44.glBindFramebufferEXT$FUNC, false
    );
    static final FunctionDescriptor glDeleteFramebuffersEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteFramebuffersEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteFramebuffersEXT",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$44.glDeleteFramebuffersEXT$FUNC, false
    );
}


