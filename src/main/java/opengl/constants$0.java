// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$0 {

    static final FunctionDescriptor glClampColorARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glClampColorARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClampColorARB",
        "(II)V",
        constants$0.glClampColorARB$FUNC, false
    );
    static final FunctionDescriptor glDrawBuffersARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDrawBuffersARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawBuffersARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$0.glDrawBuffersARB$FUNC, false
    );
    static final FunctionDescriptor glDrawElementsBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glDrawElementsBaseVertex$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawElementsBaseVertex",
        "(IIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$0.glDrawElementsBaseVertex$FUNC, false
    );
    static final FunctionDescriptor glDrawRangeElementsBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle glDrawRangeElementsBaseVertex$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawRangeElementsBaseVertex",
        "(IIIIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$0.glDrawRangeElementsBaseVertex$FUNC, false
    );
    static final FunctionDescriptor glDrawElementsInstancedBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle glDrawElementsInstancedBaseVertex$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDrawElementsInstancedBaseVertex",
        "(IIILjdk/incubator/foreign/MemoryAddress;II)V",
        constants$0.glDrawElementsInstancedBaseVertex$FUNC, false
    );
    static final FunctionDescriptor glMultiDrawElementsBaseVertex$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiDrawElementsBaseVertex$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiDrawElementsBaseVertex",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$0.glMultiDrawElementsBaseVertex$FUNC, false
    );
}


