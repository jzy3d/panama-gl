// Generated by jextract

package opengl.macos.v10_15_3;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$57 {

    static final FunctionDescriptor glGetTexParameterIuivEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetTexParameterIuivEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetTexParameterIuivEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$57.glGetTexParameterIuivEXT$FUNC, false
    );
    static final FunctionDescriptor glGetQueryObjecti64vEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetQueryObjecti64vEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetQueryObjecti64vEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$57.glGetQueryObjecti64vEXT$FUNC, false
    );
    static final FunctionDescriptor glGetQueryObjectui64vEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetQueryObjectui64vEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetQueryObjectui64vEXT",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$57.glGetQueryObjectui64vEXT$FUNC, false
    );
    static final FunctionDescriptor glBindBufferRangeEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle glBindBufferRangeEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindBufferRangeEXT",
        "(IIIJJ)V",
        constants$57.glBindBufferRangeEXT$FUNC, false
    );
    static final FunctionDescriptor glBindBufferOffsetEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle glBindBufferOffsetEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindBufferOffsetEXT",
        "(IIIJ)V",
        constants$57.glBindBufferOffsetEXT$FUNC, false
    );
    static final FunctionDescriptor glBindBufferBaseEXT$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glBindBufferBaseEXT$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindBufferBaseEXT",
        "(III)V",
        constants$57.glBindBufferBaseEXT$FUNC, false
    );
}

