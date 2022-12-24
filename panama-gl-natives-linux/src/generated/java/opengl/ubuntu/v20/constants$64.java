// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$64 {

    static final FunctionDescriptor glCompressedTexImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCompressedTexImage1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexImage1D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$64.glCompressedTexImage1D$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexImage2D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCompressedTexImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexImage2D",
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$64.glCompressedTexImage2D$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexImage3D$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle glCompressedTexImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexImage3D",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$64.glCompressedTexImage3D$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexSubImage1D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCompressedTexSubImage1D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexSubImage1D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$64.glCompressedTexSubImage1D$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexSubImage2D$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle glCompressedTexSubImage2D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexSubImage2D",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$64.glCompressedTexSubImage2D$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexSubImage3D$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
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
    static final MethodHandle glCompressedTexSubImage3D$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexSubImage3D",
        "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$64.glCompressedTexSubImage3D$FUNC, false
    );
}

