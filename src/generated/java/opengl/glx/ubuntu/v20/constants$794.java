// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$794 {

    static final FunctionDescriptor PFNGLENDPERFQUERYINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLENDPERFQUERYINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$794.PFNGLENDPERFQUERYINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETFIRSTPERFQUERYIDINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFNGLGETFIRSTPERFQUERYIDINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$794.PFNGLGETFIRSTPERFQUERYIDINTELPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNEXTPERFQUERYIDINTELPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNEXTPERFQUERYIDINTELPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$794.PFNGLGETNEXTPERFQUERYIDINTELPROC$FUNC, false
    );
}


