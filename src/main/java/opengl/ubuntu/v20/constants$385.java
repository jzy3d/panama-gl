// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$385 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB1DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$385.PFNGLVERTEXATTRIB1DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$385.PFNGLVERTEXATTRIB1DVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLVERTEXATTRIB1FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IF)V",
        constants$385.PFNGLVERTEXATTRIB1FARBPROC$FUNC, false
    );
}

