// Generated by jextract

package opengl.macos.v10_15_3;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$23 {

    static final FunctionDescriptor glWeightusvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glWeightusvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWeightusvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$23.glWeightusvARB$FUNC, false
    );
    static final FunctionDescriptor glWeightuivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glWeightuivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWeightuivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$23.glWeightuivARB$FUNC, false
    );
    static final FunctionDescriptor glWeightPointerARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle glWeightPointerARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glWeightPointerARB",
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$23.glWeightPointerARB$FUNC, false
    );
    static final FunctionDescriptor glVertexBlendARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glVertexBlendARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexBlendARB",
        "(I)V",
        constants$23.glVertexBlendARB$FUNC, false
    );
    static final FunctionDescriptor glBindBufferARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glBindBufferARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glBindBufferARB",
        "(II)V",
        constants$23.glBindBufferARB$FUNC, false
    );
    static final FunctionDescriptor glDeleteBuffersARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glDeleteBuffersARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glDeleteBuffersARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$23.glDeleteBuffersARB$FUNC, false
    );
}


