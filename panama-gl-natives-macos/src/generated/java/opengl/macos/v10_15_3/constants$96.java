// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$96 {

    static final FunctionDescriptor glInterleavedArrays$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glInterleavedArrays$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glInterleavedArrays",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$96.glInterleavedArrays$FUNC, false
    );
    static final FunctionDescriptor glIsEnabled$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsEnabled$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsEnabled",
        "(I)B",
        constants$96.glIsEnabled$FUNC, false
    );
    static final FunctionDescriptor glIsList$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsList$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsList",
        "(I)B",
        constants$96.glIsList$FUNC, false
    );
    static final FunctionDescriptor glIsTexture$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsTexture$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsTexture",
        "(I)B",
        constants$96.glIsTexture$FUNC, false
    );
    static final FunctionDescriptor glLightModelf$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle glLightModelf$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLightModelf",
        "(IF)V",
        constants$96.glLightModelf$FUNC, false
    );
    static final FunctionDescriptor glLightModelfv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glLightModelfv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glLightModelfv",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$96.glLightModelfv$FUNC, false
    );
}


