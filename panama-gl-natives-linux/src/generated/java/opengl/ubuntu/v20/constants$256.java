// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$256 {

    static final FunctionDescriptor PFNGLINVALIDATETEXIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLINVALIDATETEXIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$256.PFNGLINVALIDATETEXIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINVALIDATEBUFFERSUBDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLINVALIDATEBUFFERSUBDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJ)V",
        constants$256.PFNGLINVALIDATEBUFFERSUBDATAPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINVALIDATEBUFFERDATAPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLINVALIDATEBUFFERDATAPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$256.PFNGLINVALIDATEBUFFERDATAPROC$FUNC, false
    );
}


