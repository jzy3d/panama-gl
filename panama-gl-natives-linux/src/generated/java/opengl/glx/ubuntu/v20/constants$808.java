// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$808 {

    static final FunctionDescriptor PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIJJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$808.PFNGLLGPUNAMEDBUFFERSUBDATANVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLGPUCOPYIMAGESUBDATANVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLLGPUCOPYIMAGESUBDATANVXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIIIIIIIIIII)V",
        constants$808.PFNGLLGPUCOPYIMAGESUBDATANVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLGPUINTERLOCKNVXPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLLGPUINTERLOCKNVXPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$808.PFNGLLGPUINTERLOCKNVXPROC$FUNC, false
    );
}


