// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$203 {

    static final FunctionDescriptor glutSetupVideoResizing$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutSetupVideoResizing$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSetupVideoResizing",
        "()V",
        constants$203.glutSetupVideoResizing$FUNC, false
    );
    static final FunctionDescriptor glutStopVideoResizing$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutStopVideoResizing$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutStopVideoResizing",
        "()V",
        constants$203.glutStopVideoResizing$FUNC, false
    );
    static final FunctionDescriptor glutVideoResize$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutVideoResize$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutVideoResize",
        "(IIII)V",
        constants$203.glutVideoResize$FUNC, false
    );
    static final FunctionDescriptor glutVideoPan$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutVideoPan$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutVideoPan",
        "(IIII)V",
        constants$203.glutVideoPan$FUNC, false
    );
    static final FunctionDescriptor glutReportErrors$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutReportErrors$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutReportErrors",
        "()V",
        constants$203.glutReportErrors$FUNC, false
    );
    static final FunctionDescriptor glutIgnoreKeyRepeat$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutIgnoreKeyRepeat$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutIgnoreKeyRepeat",
        "(I)V",
        constants$203.glutIgnoreKeyRepeat$FUNC, false
    );
}


