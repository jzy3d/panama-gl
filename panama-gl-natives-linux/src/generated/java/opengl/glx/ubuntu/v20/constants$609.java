// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$609 {

    static final FunctionDescriptor PFNGLGETSEPARABLEFILTEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLGETSEPARABLEFILTEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$609.PFNGLGETSEPARABLEFILTEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSEPARABLEFILTER2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLSEPARABLEFILTER2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$609.PFNGLSEPARABLEFILTER2DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTANGENT3BEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLTANGENT3BEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$609.PFNGLTANGENT3BEXTPROC$FUNC, false
    );
}

