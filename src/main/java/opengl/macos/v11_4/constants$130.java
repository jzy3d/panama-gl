// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$130 {

    static final FunctionDescriptor glMultTransposeMatrixd$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glMultTransposeMatrixd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultTransposeMatrixd",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$130.glMultTransposeMatrixd$FUNC, false
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
        constants$130.glCompressedTexImage3D$FUNC, false
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
        constants$130.glCompressedTexImage2D$FUNC, false
    );
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
        constants$130.glCompressedTexImage1D$FUNC, false
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
        constants$130.glCompressedTexSubImage3D$FUNC, false
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
        constants$130.glCompressedTexSubImage2D$FUNC, false
    );
}


