// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$447 {

    static final FunctionDescriptor PFNGLUNIFORM2FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLUNIFORM2FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFF)V",
        constants$447.PFNGLUNIFORM2FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM3FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLUNIFORM3FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFF)V",
        constants$447.PFNGLUNIFORM3FARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLUNIFORM4FARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle PFNGLUNIFORM4FARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IFFFF)V",
        constants$447.PFNGLUNIFORM4FARBPROC$FUNC, false
    );
}


