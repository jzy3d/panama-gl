// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$814 {

    static final FunctionDescriptor PFNGLCOMBINERPARAMETERINVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOMBINERPARAMETERINVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$814.PFNGLCOMBINERPARAMETERINVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMBINERINPUTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOMBINERINPUTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIII)V",
        constants$814.PFNGLCOMBINERINPUTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCOMBINEROUTPUTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle PFNGLCOMBINEROUTPUTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIBBB)V",
        constants$814.PFNGLCOMBINEROUTPUTNVPROC$FUNC, false
    );
}


