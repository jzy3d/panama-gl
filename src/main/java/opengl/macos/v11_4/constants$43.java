// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$43 {

    static final FunctionDescriptor glFogCoordPointerEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glFogCoordPointerEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFogCoordPointerEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$43.glFogCoordPointerEXT$FUNC, false
    );
    static final FunctionDescriptor glBlitFramebufferEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glBlitFramebufferEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlitFramebufferEXT",
        "(IIIIIIIIII)V",
        constants$43.glBlitFramebufferEXT$FUNC, false
    );
    static final FunctionDescriptor glRenderbufferStorageMultisampleEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glRenderbufferStorageMultisampleEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRenderbufferStorageMultisampleEXT",
        "(IIIII)V",
        constants$43.glRenderbufferStorageMultisampleEXT$FUNC, false
    );
    static final FunctionDescriptor glIsRenderbufferEXT$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsRenderbufferEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsRenderbufferEXT",
        "(I)B",
        constants$43.glIsRenderbufferEXT$FUNC, false
    );
    static final FunctionDescriptor glBindRenderbufferEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBindRenderbufferEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindRenderbufferEXT",
        "(II)V",
        constants$43.glBindRenderbufferEXT$FUNC, false
    );
    static final FunctionDescriptor glDeleteRenderbuffersEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteRenderbuffersEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteRenderbuffersEXT",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$43.glDeleteRenderbuffersEXT$FUNC, false
    );
}


