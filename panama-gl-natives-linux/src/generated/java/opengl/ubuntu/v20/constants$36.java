// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$36 {

    static final FunctionDescriptor glVertexPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glVertexPointer$FUNC, false
    );
    static final FunctionDescriptor glNormalPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glNormalPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glNormalPointer",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glNormalPointer$FUNC, false
    );
    static final FunctionDescriptor glColorPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glColorPointer$FUNC, false
    );
    static final FunctionDescriptor glIndexPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glIndexPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIndexPointer",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glIndexPointer$FUNC, false
    );
    static final FunctionDescriptor glTexCoordPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTexCoordPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoordPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glTexCoordPointer$FUNC, false
    );
    static final FunctionDescriptor glEdgeFlagPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glEdgeFlagPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEdgeFlagPointer",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glEdgeFlagPointer$FUNC, false
    );
}


