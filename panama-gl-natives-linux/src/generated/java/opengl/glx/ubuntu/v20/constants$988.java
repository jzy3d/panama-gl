// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$988 {

    static final FunctionDescriptor PFNGLLISTPARAMETERFVSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLLISTPARAMETERFVSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$988.PFNGLLISTPARAMETERFVSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLISTPARAMETERISGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLLISTPARAMETERISGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$988.PFNGLLISTPARAMETERISGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLISTPARAMETERIVSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLLISTPARAMETERIVSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$988.PFNGLLISTPARAMETERIVSGIXPROC$FUNC, false
    );
}

