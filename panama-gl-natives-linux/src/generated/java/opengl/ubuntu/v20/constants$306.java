// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$306 {

    static final FunctionDescriptor PFNGLGETNUNIFORMUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNUNIFORMUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$306.PFNGLGETNUNIFORMUIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLREADNPIXELSPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLREADNPIXELSPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$306.PFNGLREADNPIXELSPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNMAPDVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNMAPDVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$306.PFNGLGETNMAPDVPROC$FUNC, false
    );
}


