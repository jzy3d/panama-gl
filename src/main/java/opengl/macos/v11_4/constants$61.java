// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$61 {

    static final FunctionDescriptor glFinishObjectAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glFinishObjectAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFinishObjectAPPLE",
        "(II)V",
        constants$61.glFinishObjectAPPLE$FUNC, false
    );
    static final FunctionDescriptor glBufferParameteriAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glBufferParameteriAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBufferParameteriAPPLE",
        "(III)V",
        constants$61.glBufferParameteriAPPLE$FUNC, false
    );
    static final FunctionDescriptor glFlushMappedBufferRangeAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle glFlushMappedBufferRangeAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFlushMappedBufferRangeAPPLE",
        "(IJJ)V",
        constants$61.glFlushMappedBufferRangeAPPLE$FUNC, false
    );
    static final FunctionDescriptor glFlushRenderAPPLE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glFlushRenderAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFlushRenderAPPLE",
        "()V",
        constants$61.glFlushRenderAPPLE$FUNC, false
    );
    static final FunctionDescriptor glFinishRenderAPPLE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glFinishRenderAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glFinishRenderAPPLE",
        "()V",
        constants$61.glFinishRenderAPPLE$FUNC, false
    );
    static final FunctionDescriptor glSwapAPPLE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glSwapAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glSwapAPPLE",
        "()V",
        constants$61.glSwapAPPLE$FUNC, false
    );
}

