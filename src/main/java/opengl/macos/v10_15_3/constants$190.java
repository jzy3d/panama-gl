// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$190 {

    static final FunctionDescriptor glutMenuStateFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glutMenuStateFunc$func$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$190.glutMenuStateFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutMenuStateFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutMenuStateFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutMenuStateFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$190.glutMenuStateFunc$FUNC, false
    );
    static final FunctionDescriptor glutSpecialFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutSpecialFunc$func$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$190.glutSpecialFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutSpecialFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutSpecialFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSpecialFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$190.glutSpecialFunc$FUNC, false
    );
    static final FunctionDescriptor glutSpaceballMotionFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
}


