// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$5 {

    static final FunctionDescriptor glGetDoublev$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetDoublev$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetDoublev",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$5.glGetDoublev$FUNC, false
    );
    static final FunctionDescriptor glGetFloatv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetFloatv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetFloatv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$5.glGetFloatv$FUNC, false
    );
    static final FunctionDescriptor glGetIntegerv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetIntegerv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetIntegerv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$5.glGetIntegerv$FUNC, false
    );
    static final FunctionDescriptor glPushAttrib$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glPushAttrib$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPushAttrib",
        "(I)V",
        constants$5.glPushAttrib$FUNC, false
    );
    static final FunctionDescriptor glPopAttrib$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glPopAttrib$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPopAttrib",
        "()V",
        constants$5.glPopAttrib$FUNC, false
    );
    static final FunctionDescriptor glPushClientAttrib$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glPushClientAttrib$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPushClientAttrib",
        "(I)V",
        constants$5.glPushClientAttrib$FUNC, false
    );
}


