// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$258 {

    static final FunctionDescriptor PFNGLFLUSHMAPPEDBUFFERRANGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLFLUSHMAPPEDBUFFERRANGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IJJ)V",
        constants$258.PFNGLFLUSHMAPPEDBUFFERRANGEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINDVERTEXARRAYPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLBINDVERTEXARRAYPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$258.PFNGLBINDVERTEXARRAYPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEVERTEXARRAYSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEVERTEXARRAYSPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$258.PFNGLDELETEVERTEXARRAYSPROC$FUNC, false
    );
}


