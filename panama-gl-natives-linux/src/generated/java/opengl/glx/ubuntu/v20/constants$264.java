// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$264 {

    static final FunctionDescriptor PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$264.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;II)V",
        constants$264.PFNGLDRAWELEMENTSINSTANCEDBASEVERTEXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$264.PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$FUNC, false
    );
}

