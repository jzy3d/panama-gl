// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$786 {

    static final FunctionDescriptor PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$786.PFNGLGETIMAGETRANSFORMPARAMETERFVHPPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTIMODEDRAWARRAYSIBMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTIMODEDRAWARRAYSIBMPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)V",
        constants$786.PFNGLMULTIMODEDRAWARRAYSIBMPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMULTIMODEDRAWELEMENTSIBMPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLMULTIMODEDRAWELEMENTSIBMPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)V",
        constants$786.PFNGLMULTIMODEDRAWELEMENTSIBMPROC$FUNC, false
    );
}


