// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$969 {

    static final FunctionDescriptor glutReportErrors$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glutReportErrors$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glutReportErrors",
        "()V",
        constants$969.glutReportErrors$FUNC, false
    );
    static final FunctionDescriptor __ctype_get_mb_cur_max$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle __ctype_get_mb_cur_max$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "__ctype_get_mb_cur_max",
        "()J",
        constants$969.__ctype_get_mb_cur_max$FUNC, false
    );
    static final FunctionDescriptor atof$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle atof$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "atof",
        "(Ljdk/incubator/foreign/MemoryAddress;)D",
        constants$969.atof$FUNC, false
    );
    static final FunctionDescriptor atoi$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle atoi$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "atoi",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$969.atoi$FUNC, false
    );
    static final FunctionDescriptor atol$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle atol$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "atol",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$969.atol$FUNC, false
    );
    static final FunctionDescriptor atoll$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle atoll$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "atoll",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$969.atoll$FUNC, false
    );
}


