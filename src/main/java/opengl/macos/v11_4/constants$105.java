// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$105 {

    static final FunctionDescriptor glPixelStorei$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glPixelStorei$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelStorei",
        "(II)V",
        constants$105.glPixelStorei$FUNC, false
    );
    static final FunctionDescriptor glPixelTransferf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glPixelTransferf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelTransferf",
        "(IF)V",
        constants$105.glPixelTransferf$FUNC, false
    );
    static final FunctionDescriptor glPixelTransferi$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glPixelTransferi$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelTransferi",
        "(II)V",
        constants$105.glPixelTransferi$FUNC, false
    );
    static final FunctionDescriptor glPixelZoom$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glPixelZoom$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPixelZoom",
        "(FF)V",
        constants$105.glPixelZoom$FUNC, false
    );
    static final FunctionDescriptor glPointSize$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glPointSize$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPointSize",
        "(F)V",
        constants$105.glPointSize$FUNC, false
    );
    static final FunctionDescriptor glPolygonMode$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glPolygonMode$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glPolygonMode",
        "(II)V",
        constants$105.glPolygonMode$FUNC, false
    );
}


