// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$313 {

    static final FunctionDescriptor PFNGLGETTEXTURESAMPLERHANDLEARBPROC$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGETTEXTURESAMPLERHANDLEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)J",
        constants$313.PFNGLGETTEXTURESAMPLERHANDLEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAKETEXTUREHANDLERESIDENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLMAKETEXTUREHANDLERESIDENTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$313.PFNGLMAKETEXTUREHANDLERESIDENTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$313.PFNGLMAKETEXTUREHANDLENONRESIDENTARBPROC$FUNC, false
    );
}


