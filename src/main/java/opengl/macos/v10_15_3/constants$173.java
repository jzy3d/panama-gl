// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$173 {

    static final FunctionDescriptor gluTessBeginPolygon$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gluTessBeginPolygon$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessBeginPolygon",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$173.gluTessBeginPolygon$FUNC, false
    );
    static final FunctionDescriptor gluTessCallback$CallBackFunc$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gluTessCallback$CallBackFunc$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$173.gluTessCallback$CallBackFunc$FUNC, false
    );
    static final FunctionDescriptor gluTessCallback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluTessCallback$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessCallback",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$173.gluTessCallback$FUNC, false
    );
    static final FunctionDescriptor gluTessEndContour$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluTessEndContour$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessEndContour",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$173.gluTessEndContour$FUNC, false
    );
    static final FunctionDescriptor gluTessEndPolygon$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluTessEndPolygon$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessEndPolygon",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$173.gluTessEndPolygon$FUNC, false
    );
}


