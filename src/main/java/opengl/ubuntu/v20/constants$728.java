// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$728 {

    static final FunctionDescriptor PFNGLGETIMAGEHANDLENVPROC$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLGETIMAGEHANDLENVPROC$MH = RuntimeHelper.downcallHandle(
        "(IIBII)J",
        constants$728.PFNGLGETIMAGEHANDLENVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAKEIMAGEHANDLERESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_INT
    );
    static final MethodHandle PFNGLMAKEIMAGEHANDLERESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(JI)V",
        constants$728.PFNGLMAKEIMAGEHANDLERESIDENTNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_LONG
    );
    static final MethodHandle PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC$MH = RuntimeHelper.downcallHandle(
        "(J)V",
        constants$728.PFNGLMAKEIMAGEHANDLENONRESIDENTNVPROC$FUNC, false
    );
}


