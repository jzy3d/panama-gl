// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$425 {

    static final FunctionDescriptor PFNGLTRANSLATEXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTRANSLATEXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$425.PFNGLTRANSLATEXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLACCUMXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLACCUMXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$425.PFNGLACCUMXOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBITMAPXOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLBITMAPXOESPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$425.PFNGLBITMAPXOESPROC$FUNC, false
    );
}

