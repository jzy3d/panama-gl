// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$679 {

    static final FunctionDescriptor PFNGLVERTEXATTRIBL2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIBL2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IDD)V",
        constants$679.PFNGLVERTEXATTRIBL2DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIBL3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDD)V",
        constants$679.PFNGLVERTEXATTRIBL3DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIBL4DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIBL4DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IDDDD)V",
        constants$679.PFNGLVERTEXATTRIBL4DEXTPROC$FUNC, false
    );
}


