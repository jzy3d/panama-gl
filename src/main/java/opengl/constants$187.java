// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$187 {

    static final FunctionDescriptor glutMotionFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutMotionFunc$func$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$187.glutMotionFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutMotionFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutMotionFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$187.glutMotionFunc$FUNC, false
    );
    static final FunctionDescriptor glutPassiveMotionFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glutPassiveMotionFunc$func$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$187.glutPassiveMotionFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutPassiveMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutPassiveMotionFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutPassiveMotionFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$187.glutPassiveMotionFunc$FUNC, false
    );
    static final FunctionDescriptor glutEntryFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
}


