// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$208 {

    static final FunctionDescriptor PFNGLGETVERTEXATTRIBFVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBFVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$208.PFNGLGETVERTEXATTRIBFVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$208.PFNGLGETVERTEXATTRIBIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETVERTEXATTRIBPOINTERVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETVERTEXATTRIBPOINTERVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$208.PFNGLGETVERTEXATTRIBPOINTERVPROC$FUNC, false
    );
}


