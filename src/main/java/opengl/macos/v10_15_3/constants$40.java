// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$40 {

    static final FunctionDescriptor glBlendEquationSeparateEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBlendEquationSeparateEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendEquationSeparateEXT",
        "(II)V",
        constants$40.glBlendEquationSeparateEXT$FUNC, false
    );
    static final FunctionDescriptor glBlendFuncSeparateEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glBlendFuncSeparateEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendFuncSeparateEXT",
        "(IIII)V",
        constants$40.glBlendFuncSeparateEXT$FUNC, false
    );
    static final FunctionDescriptor glBlendEquationEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glBlendEquationEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBlendEquationEXT",
        "(I)V",
        constants$40.glBlendEquationEXT$FUNC, false
    );
    static final FunctionDescriptor glLabelObjectEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glLabelObjectEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLabelObjectEXT",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glLabelObjectEXT$FUNC, false
    );
    static final FunctionDescriptor glGetObjectLabelEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle glGetObjectLabelEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetObjectLabelEXT",
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glGetObjectLabelEXT$FUNC, false
    );
    static final FunctionDescriptor glInsertEventMarkerEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glInsertEventMarkerEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glInsertEventMarkerEXT",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$40.glInsertEventMarkerEXT$FUNC, false
    );
}


