// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$901 {

    static final FunctionDescriptor PFNGLSTARTINSTRUMENTSSGIXPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLSTARTINSTRUMENTSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$901.PFNGLSTARTINSTRUMENTSSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLSTOPINSTRUMENTSSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLSTOPINSTRUMENTSSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$901.PFNGLSTOPINSTRUMENTSSGIXPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETLISTPARAMETERFVSGIXPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETLISTPARAMETERFVSGIXPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$901.PFNGLGETLISTPARAMETERFVSGIXPROC$FUNC, false
    );
}


