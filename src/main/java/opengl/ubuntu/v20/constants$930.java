// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$930 {

    static final FunctionDescriptor _GLUfuncptr$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _GLUfuncptr$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$930._GLUfuncptr$FUNC, false
    );
    static final FunctionDescriptor gluBeginCurve$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluBeginCurve$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluBeginCurve",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$930.gluBeginCurve$FUNC, false
    );
    static final FunctionDescriptor gluBeginPolygon$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluBeginPolygon$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluBeginPolygon",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$930.gluBeginPolygon$FUNC, false
    );
    static final FunctionDescriptor gluBeginSurface$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluBeginSurface$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluBeginSurface",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$930.gluBeginSurface$FUNC, false
    );
    static final FunctionDescriptor gluBeginTrim$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluBeginTrim$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluBeginTrim",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$930.gluBeginTrim$FUNC, false
    );
    static final FunctionDescriptor gluBuild1DMipmapLevels$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluBuild1DMipmapLevels$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluBuild1DMipmapLevels",
        "(IIIIIIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$930.gluBuild1DMipmapLevels$FUNC, false
    );
}


