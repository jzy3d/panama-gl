// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$604 {

    static final FunctionDescriptor PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIJ)V",
        constants$604.PFNGLVERTEXARRAYFOGCOORDOFFSETEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIJ)V",
        constants$604.PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIBIJ)V",
        constants$604.PFNGLVERTEXARRAYVERTEXATTRIBOFFSETEXTPROC$FUNC, false
    );
}


