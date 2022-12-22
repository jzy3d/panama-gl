// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$96 {

    static final FunctionDescriptor glTranslated$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glTranslated$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTranslated",
        "(DDD)V",
        constants$96.glTranslated$FUNC, false
    );
    static final FunctionDescriptor glTranslatef$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glTranslatef$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glTranslatef",
        "(FFF)V",
        constants$96.glTranslatef$FUNC, false
    );
    static final FunctionDescriptor glIsList$FUNC = FunctionDescriptor.of(C_CHAR,
        C_INT
    );
    static final MethodHandle glIsList$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glIsList",
        "(I)B",
        constants$96.glIsList$FUNC, false
    );
    static final FunctionDescriptor glDeleteLists$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glDeleteLists$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glDeleteLists",
        "(II)V",
        constants$96.glDeleteLists$FUNC, false
    );
    static final FunctionDescriptor glGenLists$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle glGenLists$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glGenLists",
        "(I)I",
        constants$96.glGenLists$FUNC, false
    );
    static final FunctionDescriptor glNewList$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glNewList$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glNewList",
        "(II)V",
        constants$96.glNewList$FUNC, false
    );
}


