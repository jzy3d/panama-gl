// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$292 {

    static final FunctionDescriptor PFNGLTEXTUREPARAMETERIUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXTUREPARAMETERIUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$292.PFNGLTEXTUREPARAMETERIUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREPARAMETERIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXTUREPARAMETERIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$292.PFNGLTEXTUREPARAMETERIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENERATETEXTUREMIPMAPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLGENERATETEXTUREMIPMAPPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$292.PFNGLGENERATETEXTUREMIPMAPPROC$FUNC, false
    );
}


