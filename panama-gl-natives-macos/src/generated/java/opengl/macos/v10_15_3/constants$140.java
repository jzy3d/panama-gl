// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$140 {

    static final FunctionDescriptor glSecondaryColor3uiv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3uiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3uiv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$140.glSecondaryColor3uiv$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3us$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glSecondaryColor3us$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3us",
        "(SSS)V",
        constants$140.glSecondaryColor3us$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColor3usv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glSecondaryColor3usv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColor3usv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$140.glSecondaryColor3usv$FUNC, false
    );
    static final FunctionDescriptor glSecondaryColorPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glSecondaryColorPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSecondaryColorPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$140.glSecondaryColorPointer$FUNC, false
    );
    static final FunctionDescriptor glPointParameterf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glPointParameterf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPointParameterf",
        "(IF)V",
        constants$140.glPointParameterf$FUNC, false
    );
    static final FunctionDescriptor glPointParameterfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glPointParameterfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPointParameterfv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$140.glPointParameterfv$FUNC, false
    );
}


