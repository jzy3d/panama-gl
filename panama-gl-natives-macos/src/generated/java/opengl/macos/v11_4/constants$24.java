// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$24 {

    static final FunctionDescriptor glGenBuffersARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glGenBuffersARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGenBuffersARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$24.glGenBuffersARB$FUNC, false
    );
    static final FunctionDescriptor glIsBufferARB$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsBufferARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glIsBufferARB",
        "(I)B",
        constants$24.glIsBufferARB$FUNC, false
    );
    static final FunctionDescriptor glBufferDataARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glBufferDataARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBufferDataARB",
        "(IJLjdk/incubator/foreign/MemoryAddress;I)V",
        constants$24.glBufferDataARB$FUNC, false
    );
    static final FunctionDescriptor glBufferSubDataARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle glBufferSubDataARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBufferSubDataARB",
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$24.glBufferSubDataARB$FUNC, false
    );
    static final FunctionDescriptor glGetBufferSubDataARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle glGetBufferSubDataARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glGetBufferSubDataARB",
        "(IJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$24.glGetBufferSubDataARB$FUNC, false
    );
    static final FunctionDescriptor glMapBufferARB$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle glMapBufferARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMapBufferARB",
        "(II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$24.glMapBufferARB$FUNC, false
    );
}

