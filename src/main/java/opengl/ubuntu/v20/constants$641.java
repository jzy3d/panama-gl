// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$641 {

    static final FunctionDescriptor PFNGLGETUNSIGNEDBYTEI_VEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETUNSIGNEDBYTEI_VEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$641.PFNGLGETUNSIGNEDBYTEI_VEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLDELETEMEMORYOBJECTSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLDELETEMEMORYOBJECTSEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$641.PFNGLDELETEMEMORYOBJECTSEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLISMEMORYOBJECTEXTPROC$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle PFNGLISMEMORYOBJECTEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(I)B",
        constants$641.PFNGLISMEMORYOBJECTEXTPROC$FUNC, false
    );
}


