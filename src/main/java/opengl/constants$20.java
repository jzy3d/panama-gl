// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$20 {

    static final FunctionDescriptor glGetSynciv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetSynciv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetSynciv",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$20.glGetSynciv$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexImage3DARB$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle glCompressedTexImage3DARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexImage3DARB",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$20.glCompressedTexImage3DARB$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexImage2DARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCompressedTexImage2DARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexImage2DARB",
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$20.glCompressedTexImage2DARB$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexImage1DARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glCompressedTexImage1DARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexImage1DARB",
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$20.glCompressedTexImage1DARB$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexSubImage3DARB$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle glCompressedTexSubImage3DARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexSubImage3DARB",
        "(IIIIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$20.glCompressedTexSubImage3DARB$FUNC, false
    );
    static final FunctionDescriptor glCompressedTexSubImage2DARB$FUNC = FunctionDescriptor.ofVoid(
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
    static final MethodHandle glCompressedTexSubImage2DARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glCompressedTexSubImage2DARB",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$20.glCompressedTexSubImage2DARB$FUNC, false
    );
}


