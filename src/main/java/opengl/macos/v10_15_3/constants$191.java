// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$191 {

    static final FunctionDescriptor glutSpaceballMotionFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutSpaceballMotionFunc$func$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$191.glutSpaceballMotionFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutSpaceballMotionFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutSpaceballMotionFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSpaceballMotionFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$191.glutSpaceballMotionFunc$FUNC, false
    );
    static final FunctionDescriptor glutSpaceballRotateFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glutSpaceballRotateFunc$func$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$191.glutSpaceballRotateFunc$func$FUNC, false
    );
    static final FunctionDescriptor glutSpaceballRotateFunc$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glutSpaceballRotateFunc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutSpaceballRotateFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$191.glutSpaceballRotateFunc$FUNC, false
    );
    static final FunctionDescriptor glutSpaceballButtonFunc$func$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
}

