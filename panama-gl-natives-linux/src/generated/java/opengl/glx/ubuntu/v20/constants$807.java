// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$807 {

    static final FunctionDescriptor PFNGLMULTICASTSCISSORARRAYVNVXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLMULTICASTSCISSORARRAYVNVXPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$807.PFNGLMULTICASTSCISSORARRAYVNVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLASYNCCOPYBUFFERSUBDATANVXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLASYNCCOPYBUFFERSUBDATANVXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIJJJILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$807.PFNGLASYNCCOPYBUFFERSUBDATANVXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLASYNCCOPYIMAGESUBDATANVXPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
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
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFNGLASYNCCOPYIMAGESUBDATANVXPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIIIIIIIIIIIIIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$807.PFNGLASYNCCOPYIMAGESUBDATANVXPROC$FUNC, false
    );
}


