// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$201 {

    static final FunctionDescriptor PFNGLCOMPILESHADERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLCOMPILESHADERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$201.PFNGLCOMPILESHADERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATEPROGRAMPROC$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle PFNGLCREATEPROGRAMPROC$MH = RuntimeHelper.downcallHandle(
        "()I",
        constants$201.PFNGLCREATEPROGRAMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLCREATESHADERPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCREATESHADERPROC$MH = RuntimeHelper.downcallHandle(
        "(I)I",
        constants$201.PFNGLCREATESHADERPROC$FUNC, false
    );
}


