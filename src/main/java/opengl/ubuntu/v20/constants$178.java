// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$178 {

    static final FunctionDescriptor PFNGLUNIFORMBLOCKBINDINGPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUNIFORMBLOCKBINDINGPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$178.PFNGLUNIFORMBLOCKBINDINGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDRAWELEMENTSBASEVERTEXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PFNGLDRAWELEMENTSBASEVERTEXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;I)V",
        constants$178.PFNGLDRAWELEMENTSBASEVERTEXPROC$FUNC, false
    );
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
        constants$178.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$FUNC, false
    );
}

