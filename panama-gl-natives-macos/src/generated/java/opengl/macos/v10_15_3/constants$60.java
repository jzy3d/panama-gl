// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$60 {

    static final FunctionDescriptor glDeleteFencesAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteFencesAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteFencesAPPLE",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$60.glDeleteFencesAPPLE$FUNC, false
    );
    static final FunctionDescriptor glSetFenceAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glSetFenceAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSetFenceAPPLE",
        "(I)V",
        constants$60.glSetFenceAPPLE$FUNC, false
    );
    static final FunctionDescriptor glIsFenceAPPLE$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsFenceAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsFenceAPPLE",
        "(I)B",
        constants$60.glIsFenceAPPLE$FUNC, false
    );
    static final FunctionDescriptor glTestFenceAPPLE$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glTestFenceAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTestFenceAPPLE",
        "(I)B",
        constants$60.glTestFenceAPPLE$FUNC, false
    );
    static final FunctionDescriptor glFinishFenceAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glFinishFenceAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFinishFenceAPPLE",
        "(I)V",
        constants$60.glFinishFenceAPPLE$FUNC, false
    );
    static final FunctionDescriptor glTestObjectAPPLE$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT,
        C_INT
    );
    static final MethodHandle glTestObjectAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTestObjectAPPLE",
        "(II)B",
        constants$60.glTestObjectAPPLE$FUNC, false
    );
}


