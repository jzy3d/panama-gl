// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$470 {

    static final FunctionDescriptor PFNGLGETBUFFERPOINTERVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETBUFFERPOINTERVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$470.PFNGLGETBUFFERPOINTERVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1DARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ID)V",
        constants$470.PFNGLVERTEXATTRIB1DARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVERTEXATTRIB1DVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVERTEXATTRIB1DVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$470.PFNGLVERTEXATTRIB1DVARBPROC$FUNC, false
    );
}


