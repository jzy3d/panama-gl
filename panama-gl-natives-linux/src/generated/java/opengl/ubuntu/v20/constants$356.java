// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$356 {

    static final FunctionDescriptor PFNGLGETNMINMAXARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNMINMAXARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IBIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$356.PFNGLGETNMINMAXARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$356.PFNGLFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$356.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, false
    );
}

