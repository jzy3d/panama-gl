// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$180 {

    static final FunctionDescriptor glutHideWindow$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutHideWindow$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutHideWindow",
        "()V",
        constants$180.glutHideWindow$FUNC, false
    );
    static final FunctionDescriptor glutFullScreen$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutFullScreen$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutFullScreen",
        "()V",
        constants$180.glutFullScreen$FUNC, false
    );
    static final FunctionDescriptor glutSetCursor$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutSetCursor$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSetCursor",
        "(I)V",
        constants$180.glutSetCursor$FUNC, false
    );
    static final FunctionDescriptor glutWarpPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutWarpPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWarpPointer",
        "(II)V",
        constants$180.glutWarpPointer$FUNC, false
    );
    static final FunctionDescriptor glutSurfaceTexture$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutSurfaceTexture$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSurfaceTexture",
        "(III)V",
        constants$180.glutSurfaceTexture$FUNC, false
    );
    static final FunctionDescriptor glutWMCloseFunc$func$FUNC = FunctionDescriptor.ofVoid();
}


