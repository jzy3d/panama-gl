// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$391 {

    static final FunctionDescriptor PFNGLGETNUNIFORMIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNUNIFORMIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$391.PFNGLGETNUNIFORMIVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNUNIFORMUIVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNUNIFORMUIVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$391.PFNGLGETNUNIFORMUIVPROC$FUNC, false
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
        constants$391.PFNGLREADNPIXELSPROC$FUNC, false
    );
}


