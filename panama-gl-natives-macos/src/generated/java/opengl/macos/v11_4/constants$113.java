// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$113 {

    static final FunctionDescriptor glRectiv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectiv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$113.glRectiv$FUNC, false
    );
    static final FunctionDescriptor glRects$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRects$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRects",
        "(SSSS)V",
        constants$113.glRects$FUNC, false
    );
    static final FunctionDescriptor glRectsv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glRectsv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRectsv",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$113.glRectsv$FUNC, false
    );
    static final FunctionDescriptor glRenderMode$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glRenderMode$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glRenderMode",
        "(I)I",
        constants$113.glRenderMode$FUNC, false
    );
    static final FunctionDescriptor glResetHistogram$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glResetHistogram$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glResetHistogram",
        "(I)V",
        constants$113.glResetHistogram$FUNC, false
    );
    static final FunctionDescriptor glResetMinmax$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glResetMinmax$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glResetMinmax",
        "(I)V",
        constants$113.glResetMinmax$FUNC, false
    );
}


