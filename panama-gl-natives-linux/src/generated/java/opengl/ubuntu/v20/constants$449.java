// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$449 {

    static final FunctionDescriptor PFNGLDEPTHRANGEFOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLDEPTHRANGEFOESPROC$MH = RuntimeHelper.downcallHandle(
        "(FF)V",
        constants$449.PFNGLDEPTHRANGEFOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRUSTUMFOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLFRUSTUMFOESPROC$MH = RuntimeHelper.downcallHandle(
        "(FFFFFF)V",
        constants$449.PFNGLFRUSTUMFOESPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETCLIPPLANEFOESPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCLIPPLANEFOESPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$449.PFNGLGETCLIPPLANEFOESPROC$FUNC, false
    );
}


