// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$937 {

    static final FunctionDescriptor gluPwlCurve$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle gluPwlCurve$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluPwlCurve",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)V",
        constants$937.gluPwlCurve$FUNC, false
    );
    static final FunctionDescriptor gluQuadricCallback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluQuadricCallback$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricCallback",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$937.gluQuadricCallback$FUNC, false
    );
    static final FunctionDescriptor gluQuadricDrawStyle$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle gluQuadricDrawStyle$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricDrawStyle",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$937.gluQuadricDrawStyle$FUNC, false
    );
    static final FunctionDescriptor gluQuadricNormals$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle gluQuadricNormals$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricNormals",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$937.gluQuadricNormals$FUNC, false
    );
    static final FunctionDescriptor gluQuadricOrientation$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle gluQuadricOrientation$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricOrientation",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$937.gluQuadricOrientation$FUNC, false
    );
    static final FunctionDescriptor gluQuadricTexture$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle gluQuadricTexture$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluQuadricTexture",
        "(Ljdk/incubator/foreign/MemoryAddress;B)V",
        constants$937.gluQuadricTexture$FUNC, false
    );
}


