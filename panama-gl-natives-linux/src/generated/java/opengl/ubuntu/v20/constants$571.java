// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$571 {

    static final FunctionDescriptor PFNGLUNMAPNAMEDBUFFEREXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLUNMAPNAMEDBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$571.PFNGLUNMAPNAMEDBUFFEREXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$571.PFNGLGETNAMEDBUFFERPARAMETERIVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$571.PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$FUNC, false
    );
}


