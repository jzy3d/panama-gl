// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$137 {

    static final FunctionDescriptor glFogCoordf$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glFogCoordf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFogCoordf",
        "(F)V",
        constants$137.glFogCoordf$FUNC, false
    );
    static final FunctionDescriptor glFogCoordfv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glFogCoordfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFogCoordfv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$137.glFogCoordfv$FUNC, false
    );
    static final FunctionDescriptor glFogCoordd$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glFogCoordd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFogCoordd",
        "(D)V",
        constants$137.glFogCoordd$FUNC, false
    );
    static final FunctionDescriptor glFogCoorddv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glFogCoorddv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFogCoorddv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$137.glFogCoorddv$FUNC, false
    );
    static final FunctionDescriptor glFogCoordPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glFogCoordPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFogCoordPointer",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$137.glFogCoordPointer$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3b$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glSecondaryColor3b$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3b",
        "(BBB)V",
        constants$137.glSecondaryColor3b$FUNC, false
    );
}


