// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$868 {

    static final FunctionDescriptor PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_LONG,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JJII)V",
        constants$868.PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGENOCCLUSIONQUERIESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGENOCCLUSIONQUERIESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$868.PFNGLGENOCCLUSIONQUERIESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEOCCLUSIONQUERIESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEOCCLUSIONQUERIESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$868.PFNGLDELETEOCCLUSIONQUERIESNVPROC$FUNC, false
    );
}


