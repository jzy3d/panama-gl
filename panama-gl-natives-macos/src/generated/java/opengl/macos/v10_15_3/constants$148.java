// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$148 {

    static final FunctionDescriptor glVertexAttrib1dv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib1dv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1dv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$148.glVertexAttrib1dv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1f$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glVertexAttrib1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1f",
        "(IF)V",
        constants$148.glVertexAttrib1f$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1fv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib1fv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1fv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$148.glVertexAttrib1fv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1s$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle glVertexAttrib1s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1s",
        "(IS)V",
        constants$148.glVertexAttrib1s$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1sv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib1sv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1sv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$148.glVertexAttrib1sv$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2d$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertexAttrib2d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2d",
        "(IDD)V",
        constants$148.glVertexAttrib2d$FUNC, false
    );
}


