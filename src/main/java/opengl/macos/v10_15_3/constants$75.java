// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$75 {

    static final FunctionDescriptor glColor4uiv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4uiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4uiv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$75.glColor4uiv$FUNC, false
    );
    static final FunctionDescriptor glColor4us$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glColor4us$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4us",
        "(SSSS)V",
        constants$75.glColor4us$FUNC, false
    );
    static final FunctionDescriptor glColor4usv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4usv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4usv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$75.glColor4usv$FUNC, false
    );
    static final FunctionDescriptor glColorMask$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glColorMask$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorMask",
        "(BBBB)V",
        constants$75.glColorMask$FUNC, false
    );
    static final FunctionDescriptor glColorMaterial$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glColorMaterial$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorMaterial",
        "(II)V",
        constants$75.glColorMaterial$FUNC, false
    );
    static final FunctionDescriptor glColorPointer$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glColorPointer$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColorPointer",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$75.glColorPointer$FUNC, false
    );
}


