// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$357 {

    static final FunctionDescriptor PFNGLEVALUATEDEPTHVALUESARBPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLEVALUATEDEPTHVALUESARBPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$357.PFNGLEVALUATEDEPTHVALUESARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMINSAMPLESHADINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle PFNGLMINSAMPLESHADINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(F)V",
        constants$357.PFNGLMINSAMPLESHADINGARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEOBJECTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLDELETEOBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$357.PFNGLDELETEOBJECTARBPROC$FUNC, false
    );
}

