// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$613 {

    static final FunctionDescriptor PFNGLBINORMAL3BEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLBINORMAL3BEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(BBB)V",
        constants$613.PFNGLBINORMAL3BEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3BVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLBINORMAL3BVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$613.PFNGLBINORMAL3BVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLBINORMAL3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLBINORMAL3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(DDD)V",
        constants$613.PFNGLBINORMAL3DEXTPROC$FUNC, false
    );
}


