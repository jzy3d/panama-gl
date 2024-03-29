// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$938 {

    static final FunctionDescriptor gluScaleImage$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluScaleImage$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluScaleImage",
        "(IIIILjdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$938.gluScaleImage$FUNC, false
    );
    static final FunctionDescriptor gluSphere$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_DOUBLE,
        C_INT,
        C_INT
    );
    static final MethodHandle gluSphere$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluSphere",
        "(Ljdk/incubator/foreign/MemoryAddress;DII)V",
        constants$938.gluSphere$FUNC, false
    );
    static final FunctionDescriptor gluTessBeginContour$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluTessBeginContour$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessBeginContour",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$938.gluTessBeginContour$FUNC, false
    );
    static final FunctionDescriptor gluTessBeginPolygon$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gluTessBeginPolygon$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessBeginPolygon",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$938.gluTessBeginPolygon$FUNC, false
    );
    static final FunctionDescriptor gluTessCallback$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gluTessCallback$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessCallback",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$938.gluTessCallback$FUNC, false
    );
    static final FunctionDescriptor gluTessEndContour$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle gluTessEndContour$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "gluTessEndContour",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$938.gluTessEndContour$FUNC, false
    );
}


