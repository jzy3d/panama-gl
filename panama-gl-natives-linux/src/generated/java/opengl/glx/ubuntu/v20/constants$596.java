// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$596 {

    static final FunctionDescriptor PFNGLVERTEXSTREAM4DATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXSTREAM4DATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDDD)V",
        constants$596.PFNGLVERTEXSTREAM4DATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXSTREAM4DVATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXSTREAM4DVATIPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$596.PFNGLVERTEXSTREAM4DVATIPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNORMALSTREAM3BATIPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLNORMALSTREAM3BATIPROC$MH = RuntimeHelper.downcallHandle(
        "(IBBB)V",
        constants$596.PFNGLNORMALSTREAM3BATIPROC$FUNC, false
    );
}

