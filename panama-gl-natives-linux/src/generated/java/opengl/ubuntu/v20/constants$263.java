// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$263 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBLFORMATPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBLFORMATPROC$MH = RuntimeHelper.downcallHandle(
        "(IIII)V",
        constants$263.PFNGLVERTEXATTRIBLFORMATPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBBINDINGPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXATTRIBBINDINGPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$263.PFNGLVERTEXATTRIBBINDINGPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXBINDINGDIVISORPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLVERTEXBINDINGDIVISORPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$263.PFNGLVERTEXBINDINGDIVISORPROC$FUNC, false
    );
}

