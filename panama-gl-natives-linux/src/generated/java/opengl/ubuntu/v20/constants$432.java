// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$432 {

    static final FunctionDescriptor PFNGLGETTEXGENXVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXGENXVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$432.PFNGLGETTEXGENXVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTEXLEVELPARAMETERXVOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXLEVELPARAMETERXVOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$432.PFNGLGETTEXLEVELPARAMETERXVOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINDEXXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLINDEXXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$432.PFNGLINDEXXOESPROC$FUNC, false
    );
}

