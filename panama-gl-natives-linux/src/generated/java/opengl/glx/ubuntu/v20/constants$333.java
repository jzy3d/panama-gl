// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$333 {

    static final FunctionDescriptor PFNGLDEPTHRANGEINDEXEDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLDEPTHRANGEINDEXEDPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$333.PFNGLDEPTHRANGEINDEXEDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFLOATI_VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFLOATI_VPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$333.PFNGLGETFLOATI_VPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETDOUBLEI_VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETDOUBLEI_VPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$333.PFNGLGETDOUBLEI_VPROC$FUNC, false
    );
}

