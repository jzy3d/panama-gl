// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$986 {

    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "mbtowc",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$986.mbtowc$FUNC, false
    );
    static final FunctionDescriptor wctomb$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle wctomb$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "wctomb",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$986.wctomb$FUNC, false
    );
    static final FunctionDescriptor mbstowcs$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mbstowcs$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "mbstowcs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$986.mbstowcs$FUNC, false
    );
    static final FunctionDescriptor wcstombs$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle wcstombs$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "wcstombs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$986.wcstombs$FUNC, false
    );
    static final FunctionDescriptor rpmatch$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle rpmatch$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "rpmatch",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$986.rpmatch$FUNC, false
    );
    static final FunctionDescriptor getsubopt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle getsubopt$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "getsubopt",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$986.getsubopt$FUNC, false
    );
}

