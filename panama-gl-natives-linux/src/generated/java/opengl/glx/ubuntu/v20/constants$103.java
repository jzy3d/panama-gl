// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$103 {

    static final FunctionDescriptor glNormal3dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3dv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$103.glNormal3dv$FUNC, false
    );
    static final FunctionDescriptor glNormal3fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3fv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$103.glNormal3fv$FUNC, false
    );
    static final FunctionDescriptor glNormal3iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3iv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$103.glNormal3iv$FUNC, false
    );
    static final FunctionDescriptor glNormal3sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glNormal3sv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNormal3sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$103.glNormal3sv$FUNC, false
    );
    static final FunctionDescriptor glIndexd$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glIndexd$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glIndexd",
        "(D)V",
        constants$103.glIndexd$FUNC, false
    );
    static final FunctionDescriptor glIndexf$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glIndexf$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glIndexf",
        "(F)V",
        constants$103.glIndexf$FUNC, false
    );
}


