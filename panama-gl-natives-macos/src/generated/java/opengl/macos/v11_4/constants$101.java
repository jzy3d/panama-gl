// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$101 {

    static final FunctionDescriptor glMateriali$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glMateriali$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMateriali",
        "(III)V",
        constants$101.glMateriali$FUNC, false
    );
    static final FunctionDescriptor glMaterialiv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMaterialiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMaterialiv",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$101.glMaterialiv$FUNC, false
    );
    static final FunctionDescriptor glMatrixMode$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glMatrixMode$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMatrixMode",
        "(I)V",
        constants$101.glMatrixMode$FUNC, false
    );
    static final FunctionDescriptor glMinmax$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle glMinmax$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMinmax",
        "(IIB)V",
        constants$101.glMinmax$FUNC, false
    );
    static final FunctionDescriptor glMultMatrixd$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glMultMatrixd$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultMatrixd",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$101.glMultMatrixd$FUNC, false
    );
    static final FunctionDescriptor glMultMatrixf$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glMultMatrixf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultMatrixf",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$101.glMultMatrixf$FUNC, false
    );
}


