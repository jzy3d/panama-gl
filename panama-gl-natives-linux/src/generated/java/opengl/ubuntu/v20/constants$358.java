// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$358 {

    static final FunctionDescriptor PFNGLGETHANDLEARBPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGETHANDLEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$358.PFNGLGETHANDLEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDETACHOBJECTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLDETACHOBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$358.PFNGLDETACHOBJECTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATESHADEROBJECTARBPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCREATESHADEROBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$358.PFNGLCREATESHADEROBJECTARBPROC$FUNC, false
    );
}

