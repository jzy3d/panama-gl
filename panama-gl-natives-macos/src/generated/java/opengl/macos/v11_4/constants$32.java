// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$32 {

    static final FunctionDescriptor glVertexAttrib3fvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib3fvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3fvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$32.glVertexAttrib3fvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3sARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glVertexAttrib3sARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3sARB",
        "(ISSS)V",
        constants$32.glVertexAttrib3sARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib3svARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib3svARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib3svARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$32.glVertexAttrib3svARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4NbvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4NbvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NbvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$32.glVertexAttrib4NbvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4NivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4NivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$32.glVertexAttrib4NivARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4NsvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4NsvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NsvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$32.glVertexAttrib4NsvARB$FUNC, false
    );
}


