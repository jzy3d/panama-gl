// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$98 {

    static final FunctionDescriptor glLineStipple$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle glLineStipple$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLineStipple",
        "(IS)V",
        constants$98.glLineStipple$FUNC, false
    );
    static final FunctionDescriptor glLineWidth$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glLineWidth$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLineWidth",
        "(F)V",
        constants$98.glLineWidth$FUNC, false
    );
    static final FunctionDescriptor glListBase$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glListBase$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glListBase",
        "(I)V",
        constants$98.glListBase$FUNC, false
    );
    static final FunctionDescriptor glLoadIdentity$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glLoadIdentity$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLoadIdentity",
        "()V",
        constants$98.glLoadIdentity$FUNC, false
    );
    static final FunctionDescriptor glLoadMatrixd$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glLoadMatrixd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLoadMatrixd",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$98.glLoadMatrixd$FUNC, false
    );
    static final FunctionDescriptor glLoadMatrixf$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glLoadMatrixf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLoadMatrixf",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$98.glLoadMatrixf$FUNC, false
    );
}


