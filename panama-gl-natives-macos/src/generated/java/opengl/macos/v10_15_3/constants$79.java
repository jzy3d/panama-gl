// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$79 {

    static final FunctionDescriptor glCopyTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexSubImage2D",
        "(IIIIIIII)V",
        constants$79.glCopyTexSubImage2D$FUNC, false
    );
    static final FunctionDescriptor glCopyTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle glCopyTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexSubImage3D",
        "(IIIIIIIII)V",
        constants$79.glCopyTexSubImage3D$FUNC, false
    );
    static final FunctionDescriptor glCullFace$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glCullFace$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCullFace",
        "(I)V",
        constants$79.glCullFace$FUNC, false
    );
    static final FunctionDescriptor glDeleteLists$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glDeleteLists$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteLists",
        "(II)V",
        constants$79.glDeleteLists$FUNC, false
    );
    static final FunctionDescriptor glDeleteTextures$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteTextures$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteTextures",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$79.glDeleteTextures$FUNC, false
    );
    static final FunctionDescriptor glDepthFunc$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glDepthFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDepthFunc",
        "(I)V",
        constants$79.glDepthFunc$FUNC, false
    );
}


