// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$49 {

    static final FunctionDescriptor glAreTexturesResident$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glAreTexturesResident$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glAreTexturesResident",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)B",
        constants$49.glAreTexturesResident$FUNC, false
    );
    static final FunctionDescriptor glIsTexture$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsTexture$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsTexture",
        "(I)B",
        constants$49.glIsTexture$FUNC, false
    );
    static final FunctionDescriptor glTexSubImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexSubImage1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexSubImage1D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$49.glTexSubImage1D$FUNC, false
    );
    static final FunctionDescriptor glTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexSubImage2D",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$49.glTexSubImage2D$FUNC, false
    );
    static final FunctionDescriptor glCopyTexImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyTexImage1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexImage1D",
        "(IIIIIII)V",
        constants$49.glCopyTexImage1D$FUNC, false
    );
    static final FunctionDescriptor glCopyTexImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glCopyTexImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCopyTexImage2D",
        "(IIIIIIII)V",
        constants$49.glCopyTexImage2D$FUNC, false
    );
}


