// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$964 {

    static final FunctionDescriptor glutWireCone$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT
    );
    static final MethodHandle glutWireCone$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWireCone",
        "(DDII)V",
        constants$964.glutWireCone$FUNC, false
    );
    static final FunctionDescriptor glutSolidCone$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT
    );
    static final MethodHandle glutSolidCone$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSolidCone",
        "(DDII)V",
        constants$964.glutSolidCone$FUNC, false
    );
    static final FunctionDescriptor glutWireTorus$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT
    );
    static final MethodHandle glutWireTorus$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWireTorus",
        "(DDII)V",
        constants$964.glutWireTorus$FUNC, false
    );
    static final FunctionDescriptor glutSolidTorus$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_INT,
        C_INT
    );
    static final MethodHandle glutSolidTorus$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSolidTorus",
        "(DDII)V",
        constants$964.glutSolidTorus$FUNC, false
    );
    static final FunctionDescriptor glutWireDodecahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutWireDodecahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWireDodecahedron",
        "()V",
        constants$964.glutWireDodecahedron$FUNC, false
    );
    static final FunctionDescriptor glutSolidDodecahedron$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSolidDodecahedron$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSolidDodecahedron",
        "()V",
        constants$964.glutSolidDodecahedron$FUNC, false
    );
}


