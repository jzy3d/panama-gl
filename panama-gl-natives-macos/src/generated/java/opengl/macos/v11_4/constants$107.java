// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$107 {

    static final FunctionDescriptor glPrioritizeTextures$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glPrioritizeTextures$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPrioritizeTextures",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$107.glPrioritizeTextures$FUNC, false
    );
    static final FunctionDescriptor glPushAttrib$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glPushAttrib$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPushAttrib",
        "(I)V",
        constants$107.glPushAttrib$FUNC, false
    );
    static final FunctionDescriptor glPushClientAttrib$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glPushClientAttrib$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPushClientAttrib",
        "(I)V",
        constants$107.glPushClientAttrib$FUNC, false
    );
    static final FunctionDescriptor glPushMatrix$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPushMatrix$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPushMatrix",
        "()V",
        constants$107.glPushMatrix$FUNC, false
    );
    static final FunctionDescriptor glPushName$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glPushName$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPushName",
        "(I)V",
        constants$107.glPushName$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRasterPos2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRasterPos2d",
        "(DD)V",
        constants$107.glRasterPos2d$FUNC, false
    );
}


