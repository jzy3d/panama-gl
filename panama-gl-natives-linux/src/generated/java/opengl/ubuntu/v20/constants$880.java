// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$880 {

    static final FunctionDescriptor PFNGLGETVIDEOCAPTUREIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVIDEOCAPTUREIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$880.PFNGLGETVIDEOCAPTUREIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVIDEOCAPTURESTREAMIVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVIDEOCAPTURESTREAMIVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$880.PFNGLGETVIDEOCAPTURESTREAMIVNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVIDEOCAPTURESTREAMFVNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVIDEOCAPTURESTREAMFVNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$880.PFNGLGETVIDEOCAPTURESTREAMFVNVPROC$FUNC, false
    );
}


