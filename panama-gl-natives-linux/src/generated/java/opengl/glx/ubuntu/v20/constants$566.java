// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$566 {

    static final FunctionDescriptor PFNGLGETOBJECTPARAMETERIVAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETOBJECTPARAMETERIVAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$566.PFNGLGETOBJECTPARAMETERIVAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTURERANGEAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLTEXTURERANGEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$566.PFNGLTEXTURERANGEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$566.PFNGLGETTEXPARAMETERPOINTERVAPPLEPROC$FUNC, false
    );
}

