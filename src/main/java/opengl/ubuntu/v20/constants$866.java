// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$866 {

    static final FunctionDescriptor PFNGLVERTEXATTRIB4UBNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLVERTEXATTRIB4UBNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IBBBB)V",
        constants$866.PFNGLVERTEXATTRIB4UBNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB4UBVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB4UBVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$866.PFNGLVERTEXATTRIB4UBVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBS1DVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIBS1DVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$866.PFNGLVERTEXATTRIBS1DVNVPROC$FUNC, false
    );
}

