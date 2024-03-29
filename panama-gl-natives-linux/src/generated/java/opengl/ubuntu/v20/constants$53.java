// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$53 {

    static final FunctionDescriptor glMapGrid1f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMapGrid1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapGrid1f",
        "(IFF)V",
        constants$53.glMapGrid1f$FUNC, false
    );
    static final FunctionDescriptor glMapGrid2d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glMapGrid2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapGrid2d",
        "(IDDIDD)V",
        constants$53.glMapGrid2d$FUNC, false
    );
    static final FunctionDescriptor glMapGrid2f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glMapGrid2f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapGrid2f",
        "(IFFIFF)V",
        constants$53.glMapGrid2f$FUNC, false
    );
    static final FunctionDescriptor glEvalPoint1$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glEvalPoint1$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalPoint1",
        "(I)V",
        constants$53.glEvalPoint1$FUNC, false
    );
    static final FunctionDescriptor glEvalPoint2$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glEvalPoint2$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalPoint2",
        "(II)V",
        constants$53.glEvalPoint2$FUNC, false
    );
    static final FunctionDescriptor glEvalMesh1$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glEvalMesh1$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEvalMesh1",
        "(III)V",
        constants$53.glEvalMesh1$FUNC, false
    );
}


