// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$62 {

    static final FunctionDescriptor glObjectPurgeableAPPLE$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glObjectPurgeableAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glObjectPurgeableAPPLE",
        "(III)I",
        constants$62.glObjectPurgeableAPPLE$FUNC, false
    );
    static final FunctionDescriptor glObjectUnpurgeableAPPLE$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glObjectUnpurgeableAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glObjectUnpurgeableAPPLE",
        "(III)I",
        constants$62.glObjectUnpurgeableAPPLE$FUNC, false
    );
    static final FunctionDescriptor glGetObjectParameterivAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetObjectParameterivAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetObjectParameterivAPPLE",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$62.glGetObjectParameterivAPPLE$FUNC, false
    );
    static final FunctionDescriptor glTextureRangeAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glTextureRangeAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTextureRangeAPPLE",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$62.glTextureRangeAPPLE$FUNC, false
    );
    static final FunctionDescriptor glGetTexParameterPointervAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexParameterPointervAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetTexParameterPointervAPPLE",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$62.glGetTexParameterPointervAPPLE$FUNC, false
    );
    static final FunctionDescriptor glBindVertexArrayAPPLE$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glBindVertexArrayAPPLE$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindVertexArrayAPPLE",
        "(I)V",
        constants$62.glBindVertexArrayAPPLE$FUNC, false
    );
}


