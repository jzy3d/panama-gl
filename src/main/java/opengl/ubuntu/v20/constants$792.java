// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$792 {

    static final FunctionDescriptor PFNGLPATHPARAMETERFNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLPATHPARAMETERFNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$792.PFNGLPATHPARAMETERFNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHDASHARRAYNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLPATHDASHARRAYNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$792.PFNGLPATHDASHARRAYNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLPATHSTENCILFUNCNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLPATHSTENCILFUNCNVPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$792.PFNGLPATHSTENCILFUNCNVPROC$FUNC, false
    );
}


