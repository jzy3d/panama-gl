// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$721 {

    static final FunctionDescriptor PFNGLGETHISTOGRAMEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETHISTOGRAMEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IBIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$721.PFNGLGETHISTOGRAMEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETHISTOGRAMPARAMETERFVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETHISTOGRAMPARAMETERFVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$721.PFNGLGETHISTOGRAMPARAMETERFVEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETHISTOGRAMPARAMETERIVEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETHISTOGRAMPARAMETERIVEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$721.PFNGLGETHISTOGRAMPARAMETERIVEXTPROC$FUNC, false
    );
}


