// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$181 {

    static final FunctionDescriptor glutWMCloseFunc$func$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutWMCloseFunc$func$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$181.glutWMCloseFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutWMCloseFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutWMCloseFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutWMCloseFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$181.glutWMCloseFunc$FUNC, false
    );
    static final FunctionDescriptor glutCheckLoop$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutCheckLoop$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutCheckLoop",
        "()V",
        constants$181.glutCheckLoop$FUNC, false
    );
    static final FunctionDescriptor glutEstablishOverlay$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutEstablishOverlay$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutEstablishOverlay",
        "()V",
        constants$181.glutEstablishOverlay$FUNC, false
    );
    static final FunctionDescriptor glutRemoveOverlay$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutRemoveOverlay$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutRemoveOverlay",
        "()V",
        constants$181.glutRemoveOverlay$FUNC, false
    );
    static final FunctionDescriptor glutUseLayer$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutUseLayer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutUseLayer",
        "(I)V",
        constants$181.glutUseLayer$FUNC, false
    );
}


