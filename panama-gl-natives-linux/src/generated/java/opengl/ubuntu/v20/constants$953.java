// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$953 {

    static final FunctionDescriptor glutMouseFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutMouseFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutMouseFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$953.glutMouseFunc$FUNC, false
    );
    static final FunctionDescriptor glutMotionFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutMotionFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$953.glutMotionFunc$callback$FUNC, false
    );
    static final FunctionDescriptor glutMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutMotionFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutMotionFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$953.glutMotionFunc$FUNC, false
    );
    static final FunctionDescriptor glutPassiveMotionFunc$callback$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutPassiveMotionFunc$callback$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$953.glutPassiveMotionFunc$callback$FUNC, false
    );
}


