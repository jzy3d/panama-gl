// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$654 {

    static final FunctionDescriptor PFNGLPROVOKINGVERTEXEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLPROVOKINGVERTEXEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$654.PFNGLPROVOKINGVERTEXEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLRASTERSAMPLESEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLRASTERSAMPLESEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IB)V",
        constants$654.PFNGLRASTERSAMPLESEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSECONDARYCOLOR3BEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLSECONDARYCOLOR3BEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$654.PFNGLSECONDARYCOLOR3BEXTPROC$FUNC, false
    );
}

