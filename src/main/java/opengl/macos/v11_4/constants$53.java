// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$53 {

    static final FunctionDescriptor glProvokingVertexEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glProvokingVertexEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glProvokingVertexEXT",
        "(I)V",
        constants$53.glProvokingVertexEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3bEXT$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glSecondaryColor3bEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3bEXT",
        "(BBB)V",
        constants$53.glSecondaryColor3bEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3bvEXT$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3bvEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3bvEXT",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$53.glSecondaryColor3bvEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3dEXT$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glSecondaryColor3dEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3dEXT",
        "(DDD)V",
        constants$53.glSecondaryColor3dEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3dvEXT$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3dvEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3dvEXT",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$53.glSecondaryColor3dvEXT$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3fEXT$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glSecondaryColor3fEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3fEXT",
        "(FFF)V",
        constants$53.glSecondaryColor3fEXT$FUNC, false
    );
}


