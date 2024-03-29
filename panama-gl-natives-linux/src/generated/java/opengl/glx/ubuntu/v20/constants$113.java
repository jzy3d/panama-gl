// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$113 {

    static final FunctionDescriptor glTexCoord4i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glTexCoord4i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexCoord4i",
        "(IIII)V",
        constants$113.glTexCoord4i$FUNC, false
    );
    static final FunctionDescriptor glTexCoord4s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glTexCoord4s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexCoord4s",
        "(SSSS)V",
        constants$113.glTexCoord4s$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1dv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord1dv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexCoord1dv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$113.glTexCoord1dv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1fv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord1fv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexCoord1fv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$113.glTexCoord1fv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1iv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord1iv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexCoord1iv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$113.glTexCoord1iv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1sv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glTexCoord1sv$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTexCoord1sv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$113.glTexCoord1sv$FUNC, false
    );
}


