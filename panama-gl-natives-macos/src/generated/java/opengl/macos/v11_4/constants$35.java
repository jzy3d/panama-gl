// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$35 {

    static final FunctionDescriptor glVertexAttrib4ubvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4ubvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4ubvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glVertexAttrib4ubvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4uivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4uivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4uivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glVertexAttrib4uivARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4usvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4usvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4usvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glVertexAttrib4usvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttribPointerARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttribPointerARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttribPointerARB",
        "(IIIBILjdk/incubator/foreign/MemoryAddress;)V",
        constants$35.glVertexAttribPointerARB$FUNC, false
    );
    static final FunctionDescriptor glDisableVertexAttribArrayARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glDisableVertexAttribArrayARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDisableVertexAttribArrayARB",
        "(I)V",
        constants$35.glDisableVertexAttribArrayARB$FUNC, false
    );
    static final FunctionDescriptor glEnableVertexAttribArrayARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glEnableVertexAttribArrayARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glEnableVertexAttribArrayARB",
        "(I)V",
        constants$35.glEnableVertexAttribArrayARB$FUNC, false
    );
}

