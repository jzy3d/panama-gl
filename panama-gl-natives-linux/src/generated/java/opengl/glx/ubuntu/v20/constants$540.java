// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$540 {

    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$540.PFNGLNAMEDFRAMEBUFFERSAMPLEPOSITIONSFVAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFRAMEBUFFERPARAMETERFVAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETFRAMEBUFFERPARAMETERFVAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$540.PFNGLGETFRAMEBUFFERPARAMETERFVAMDPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$540.PFNGLGETNAMEDFRAMEBUFFERPARAMETERFVAMDPROC$FUNC, false
    );
}


