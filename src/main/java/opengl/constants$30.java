// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$30 {

    static final FunctionDescriptor glVertexAttrib1fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib1fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1fvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$30.glVertexAttrib1fvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1sARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT
    );
    static final MethodHandle glVertexAttrib1sARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1sARB",
        "(IS)V",
        constants$30.glVertexAttrib1sARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib1svARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib1svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib1svARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$30.glVertexAttrib1svARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertexAttrib2dARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2dARB",
        "(IDD)V",
        constants$30.glVertexAttrib2dARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib2dvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2dvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$30.glVertexAttrib2dvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib2fARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glVertexAttrib2fARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib2fARB",
        "(IFF)V",
        constants$30.glVertexAttrib2fARB$FUNC, false
    );
}


