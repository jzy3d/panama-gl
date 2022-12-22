// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$149 {

    static final FunctionDescriptor glActiveTexture$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glActiveTexture$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glActiveTexture",
        "(I)V",
        constants$149.glActiveTexture$FUNC, false
    );
    static final FunctionDescriptor glClientActiveTexture$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glClientActiveTexture$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glClientActiveTexture",
        "(I)V",
        constants$149.glClientActiveTexture$FUNC, false
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
        glx_h.LIBRARIES, "glCompressedTexImage1D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glCompressedTexImage1D$FUNC, false
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
        glx_h.LIBRARIES, "glCompressedTexImage2D",
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glCompressedTexImage2D$FUNC, false
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
        glx_h.LIBRARIES, "glCompressedTexImage3D",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glCompressedTexImage3D$FUNC, false
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
        glx_h.LIBRARIES, "glCompressedTexSubImage1D",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$149.glCompressedTexSubImage1D$FUNC, false
    );
}


