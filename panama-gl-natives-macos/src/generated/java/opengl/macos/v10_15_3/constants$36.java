// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$36 {

    static final FunctionDescriptor glGetVertexAttribPointervARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetVertexAttribPointervARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetVertexAttribPointervARB",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glGetVertexAttribPointervARB$FUNC, false
    );
    static final FunctionDescriptor glGetVertexAttribdvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetVertexAttribdvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetVertexAttribdvARB",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glGetVertexAttribdvARB$FUNC, false
    );
    static final FunctionDescriptor glGetVertexAttribfvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetVertexAttribfvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetVertexAttribfvARB",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glGetVertexAttribfvARB$FUNC, false
    );
    static final FunctionDescriptor glGetVertexAttribivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGetVertexAttribivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetVertexAttribivARB",
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glGetVertexAttribivARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2dARB$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glWindowPos2dARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2dARB",
        "(DD)V",
        constants$36.glWindowPos2dARB$FUNC, false
    );
    static final FunctionDescriptor glWindowPos2dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glWindowPos2dvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWindowPos2dvARB",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$36.glWindowPos2dvARB$FUNC, false
    );
}


