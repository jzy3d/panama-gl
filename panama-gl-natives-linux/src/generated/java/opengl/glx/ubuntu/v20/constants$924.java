// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$924 {

    static final FunctionDescriptor PFNGLFLUSHVERTEXARRAYRANGENVPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLFLUSHVERTEXARRAYRANGENVPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$924.PFNGLFLUSHVERTEXARRAYRANGENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYRANGENVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXARRAYRANGENVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$924.PFNGLVERTEXARRAYRANGENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL1I64NVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXATTRIBL1I64NVPROC$MH = RuntimeHelper.downcallHandle(
        "(IJ)V",
        constants$924.PFNGLVERTEXATTRIBL1I64NVPROC$FUNC, false
    );
}


