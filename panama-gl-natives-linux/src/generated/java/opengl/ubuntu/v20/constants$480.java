// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$480 {

    static final FunctionDescriptor PFNGLOBJECTPURGEABLEAPPLEPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLOBJECTPURGEABLEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(III)I",
        constants$480.PFNGLOBJECTPURGEABLEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLOBJECTUNPURGEABLEAPPLEPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLOBJECTUNPURGEABLEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(III)I",
        constants$480.PFNGLOBJECTUNPURGEABLEAPPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETOBJECTPARAMETERIVAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETOBJECTPARAMETERIVAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$480.PFNGLGETOBJECTPARAMETERIVAPPLEPROC$FUNC, false
    );
}


