// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$83 {

    static final FunctionDescriptor PFNGLMULTITEXCOORD1SVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD1SVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$83.PFNGLMULTITEXCOORD1SVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLMULTITEXCOORD2DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$83.PFNGLMULTITEXCOORD2DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTITEXCOORD2DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTITEXCOORD2DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$83.PFNGLMULTITEXCOORD2DVARBPROC$FUNC, false
    );
}


