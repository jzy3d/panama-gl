// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$749 {

    static final FunctionDescriptor PFNGLUSESHADERPROGRAMEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLUSESHADERPROGRAMEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$749.PFNGLUSESHADERPROGRAMEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLACTIVEPROGRAMEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLACTIVEPROGRAMEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$749.PFNGLACTIVEPROGRAMEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATESHADERPROGRAMEXTPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLCREATESHADERPROGRAMEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$749.PFNGLCREATESHADERPROGRAMEXTPROC$FUNC, false
    );
}

